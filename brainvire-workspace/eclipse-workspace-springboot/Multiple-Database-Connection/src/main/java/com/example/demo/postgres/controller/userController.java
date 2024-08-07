package com.example.demo.postgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.postgres.entities.User;
import com.example.demo.postgres.repositories.userRepository;

@RestController
public class userController {

	@Autowired
	private userRepository userRepo;
	
	@PostMapping("/addUser")
	public User addUser (@RequestBody User user) {
		User add = this.userRepo.save(user);
		return add;
	}
}
