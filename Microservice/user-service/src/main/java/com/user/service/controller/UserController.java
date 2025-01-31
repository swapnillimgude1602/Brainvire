package com.user.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entities.User;
import com.user.service.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User userResponse = userService.createUser(user);
		return new ResponseEntity<User>(userResponse, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
	}

	@GetMapping(path = "/{userId}")
	@CircuitBreaker(name = "ratingHotelCirciteBreaker", fallbackMethod = "ratingHotelCirciteBreakerHandler")
	@Retry(name = "ratingHotelRetry", fallbackMethod = "ratingHotelRetryHandler")
	@RateLimiter(name = "userRateLimiter", fallbackMethod = "rateLimitorHandler")
	public ResponseEntity<User> getUserByUserId(@PathVariable("userId") Long userId) {
		return new ResponseEntity<User>(userService.getUserByUserId(userId), HttpStatus.OK);
	}

	// create Handler Method for the Circute breaker
	public ResponseEntity<User> ratingHotelCirciteBreakerHandler(Long userId, Exception e) {
		log.error("Error is : " + e.getMessage());
		User user = new User().builder().about("dummy").email("dummuEmail").name("dummy").ratings(null).userId(0L)
				.build();
		return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
	}

	// create Handler Method for the Retry
	public ResponseEntity<User> ratingHotelRetryHandler(Long userId, Exception e) {
		log.error("Error is : " + e.getMessage());
		User user = new User().builder().about("Retry").email("RetryEmail").name("Retry").ratings(null).userId(0L)
				.build();
		return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
	}
	
	// create Handler Method for the Rate Limitor
		public ResponseEntity<User> rateLimitorHandler(Long userId, Exception e) {
			log.error("Error is : " + e.getMessage());
			User user = new User().builder().about("rateLimitorHandler").email("rateLimitorHandler").name("rateLimitorHandler").ratings(null).userId(0L)
					.build();
			return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
		}

	@DeleteMapping(path = "/{userId}")
	public ResponseEntity<User> deleteUserByUserId(@PathVariable("userId") Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User userResponse = userService.updateUser(user);
		return new ResponseEntity<User>(userResponse, HttpStatus.OK);
	}
}
