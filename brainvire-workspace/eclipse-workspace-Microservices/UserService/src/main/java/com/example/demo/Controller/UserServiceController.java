package com.example.demo.Controller;

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

import com.example.demo.Entiy.UserEntity;
import com.example.demo.Service.UserServiceImpl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/userservice")
public class UserServiceController {

	@Autowired
	private UserServiceImpl serviceImpl;

	private Logger logger = LoggerFactory.getLogger(UserServiceController.class);

	@PostMapping()
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
		UserEntity user = this.serviceImpl.saveUser(userEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}

	int retryCount = 1;

	@GetMapping("/{userid}")
	@CircuitBreaker(name = "Rating_Hotel_Breaker", fallbackMethod = "ratinghotel_Fallback")
	@Retry(name = "Rating_Hotel_Service", fallbackMethod = "ratinghotel_Fallback")
	@RateLimiter(name = "Rating_Hotel_Limiter", fallbackMethod = "ratinghotel_Fallback")
	public ResponseEntity<UserEntity> getUser(@PathVariable String userid) {
		logger.info("Getting single User Handler");
		logger.info("Retry Count:{} ", retryCount);
		retryCount++;
		return new ResponseEntity<UserEntity>(serviceImpl.getUser(userid), HttpStatus.OK);
	}

//Creating ratinghotel_Fallback method for services
	public ResponseEntity<UserEntity> ratinghotel_Fallback(String userId, Exception ex) {

		logger.info("Fallback method executed for service down", ex.getMessage());
		ex.printStackTrace();
		UserEntity user = UserEntity.builder().userEmail("dummy@gmail.com").userName("dummy")
				.userAbout("Dummy user created due to service down").build();
		return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
	}

	@GetMapping()
	public ResponseEntity<List<UserEntity>> getAllUser() {
		List<UserEntity> allUser = this.serviceImpl.getAllUsers();
		return ResponseEntity.ok(allUser);
	}

	@PutMapping("/{userid}")
	public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity, @PathVariable String userid) {
		UserEntity updatedUser = this.serviceImpl.updateUser(userEntity, userid);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("/{userid}")
	public void deleteUser(@PathVariable String userid) {
		this.serviceImpl.deleteUser(userid);
		System.out.println("User deleted");
	}
}
