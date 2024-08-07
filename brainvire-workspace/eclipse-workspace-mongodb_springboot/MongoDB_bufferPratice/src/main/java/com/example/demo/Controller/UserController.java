package com.example.demo.Controller;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Collection.User;
import com.example.demo.Service.UserServiceIf;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceIf userServiceif;

	@PostMapping("/add")
	public User userAdd(@RequestBody User user) {
		return userServiceif.save(user);
	}

	@GetMapping("/get/{name}")
	public List<User> getUserStartWith(@RequestParam("name") String name) {
		return userServiceif.getUserStartWith(name);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathParam("id") int id) {
		userServiceif.deleteUser(id);
	}

	@GetMapping("/age")
	public List<User> getByUserAge(@RequestParam Integer minAge, @RequestParam Integer maxAge) {
		return userServiceif.getUserByAge(minAge, maxAge);
	}

	@GetMapping("/search")
	public Page<User> searchUser(@RequestParam(required = false) String name,
			@RequestParam(required = false) Integer minAge, @RequestParam(required = false) Integer maxAge,
			@RequestParam(required = false) String city, @RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "5") Integer size) {
		Pageable pageable = PageRequest.of(page, size);
		return userServiceif.search(name, minAge, maxAge, city, pageable);

	}

	@GetMapping("/oldUser")
	public List<Document> getOldUserByCity() {
		return userServiceif.getOldestUserByCity();

	}
	
	@GetMapping("/population")
	public List<Document> getPopulationByCity() {
		return userServiceif.getPopulationByCity();
}
}
