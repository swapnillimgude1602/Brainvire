package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.UserException;
import com.example.demo.Model.User;
import com.example.demo.Service.UserServiceImplementation;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserServiceImplementation userService;

	@GetMapping("/profile")
	public ResponseEntity<User> getUserProfileHandler(@RequestHeader("Authorization") String jwt) throws UserException {

		User user = userService.findUserProfileByJwt(jwt);

		return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
	}
}
