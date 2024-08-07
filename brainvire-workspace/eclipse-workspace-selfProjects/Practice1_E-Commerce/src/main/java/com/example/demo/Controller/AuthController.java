package com.example.demo.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Configuration.JwtProvider;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.Cart;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Request.LoginRequest;
import com.example.demo.Response.AuthResponse;
import com.example.demo.Service.CartServiceImplementation;
import com.example.demo.Service.CustomerUserServiceImplementation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserRepository repository;
	@Autowired
	private JwtProvider jwtProvider;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private CustomerUserServiceImplementation userserviceImplementation;
	@Autowired
	private CartServiceImplementation cartService;

	public AuthController(UserRepository repository, JwtProvider jwtProvider, PasswordEncoder passwordEncoder,
			CustomerUserServiceImplementation userserviceImplementation, CartServiceImplementation cartService) {
		super();
		this.repository = repository;
		this.jwtProvider = jwtProvider;
		this.passwordEncoder = passwordEncoder;
		this.userserviceImplementation = userserviceImplementation;
		this.cartService = cartService;
	}

	@PostMapping("/signup")
	public ResponseEntity<AuthResponse> createUserHandler(@RequestBody User user) throws UserException {
		String email = user.getEmail();
		String password = user.getPassword();
		String firstname = user.getFirstName();
		String lastname = user.getLastName();
		LocalDateTime createdAt = user.getCreatedAt();
		String mobile = user.getMobile();
		String role = user.getRole();

		User isEmailExist = repository.findByEmail(email);
		if (isEmailExist != null) {
			throw new UserException("Email Already used..");
		}

		User createdUser = new User();
		createdUser.setEmail(email);
		createdUser.setPassword(passwordEncoder.encode(password));
		createdUser.setFirstName(firstname);
		createdUser.setLastName(lastname);
		createdUser.setMobile(mobile);
		createdUser.setCreatedAt(createdAt);
		createdUser.setRole(role);

		User savedUser = repository.save(createdUser);
		Cart cart = cartService.createCart(savedUser);

		Authentication authentication = new UsernamePasswordAuthenticationToken(savedUser.getEmail(),
				savedUser.getPassword());
		SecurityContextHolder.getContext().setAuthentication(authentication);

		String token = jwtProvider.generateToken(authentication);

		AuthResponse authResponse = new AuthResponse();
		authResponse.setJwt(token);
		authResponse.setMessage("Signup Success");

		return new ResponseEntity<AuthResponse>(authResponse, HttpStatus.CREATED);
	}

	@PostMapping("/signin")
	public ResponseEntity<AuthResponse> loginUserHandler(@RequestBody LoginRequest loginRequest) {

		String username = loginRequest.getEmail();
		String password = loginRequest.getPassword();

		Authentication authentication = authenticate(username, password);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String token = jwtProvider.generateToken(authentication);
		log.info("token {}", token);
		AuthResponse authResponse = new AuthResponse();
		authResponse.setJwt(token);
		authResponse.setMessage("Signin Success");

		return new ResponseEntity<AuthResponse>(authResponse, HttpStatus.CREATED);

	}

	private Authentication authenticate(String username, String password) {
		// TODO Auto-generated method stub
		UserDetails userDetails = userserviceImplementation.loadUserByUsername(username);
		if (userDetails == null) {
			throw new BadCredentialsException("No user Found...");
		}
		if (passwordEncoder.matches(password, userDetails.getPassword())) {
			// throw new BadCredentialsException("Invalid Password...");
		}
		return new UsernamePasswordAuthenticationToken(username, password, userDetails.getAuthorities());
	}

}
