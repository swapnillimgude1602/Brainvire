package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Request.AuthRequest;
import com.example.demo.Service.JwtService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/ecommerce/auth")
public class AuthController {

	@Autowired
	private UserService userService;
	@Autowired
	private JwtService jwtService;
	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/create")
	public User addUser(@RequestBody User user) {
		return this.userService.saveUser(user);
	}

	@PostMapping("/token")
	public String authenticateGetToken(@RequestBody AuthRequest adminRequest) {
		Authentication authenticate = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(adminRequest.getUsername(), adminRequest.getPassword()));

		if (authenticate.isAuthenticated()) {
			return jwtService.generateToken(adminRequest.getUsername());
		} else {
			throw new UsernameNotFoundException("Invalid User Request");
		}

	}
}
