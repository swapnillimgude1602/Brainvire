package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.SignupRequest;
import com.example.demo.Dto.UserDto;
import com.example.demo.Service.Auth.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest) {
		if (authService.hasCustomerWtihEmail(signupRequest.getEmail())) {
			return new ResponseEntity<>("Customer already Exists with this Email!!", HttpStatus.NOT_ACCEPTABLE);
		}
		UserDto createdCustomer = authService.createCustomer(signupRequest);
		if (createdCustomer == null) {
			return new ResponseEntity<>("Customer Not Created..Try Again Later!!", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);

	}
}
