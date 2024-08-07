package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/ecommerce/admin")
public class AdminController {
	
	
	@Autowired
	private UserService userService;


	@GetMapping("/show")
	public List<User> getAllusers() {
		List<User> showAllUsers = this.userService.getAllUsers();
		return showAllUsers;
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable("userId") long userId) {
		this.userService.deleteUser(userId);

	}

}

