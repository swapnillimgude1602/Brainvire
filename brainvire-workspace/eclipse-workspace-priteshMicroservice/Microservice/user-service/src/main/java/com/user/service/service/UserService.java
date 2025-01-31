package com.user.service.service;

import java.util.List;

import com.user.service.entities.User;

public interface UserService {

	User createUser(User user);
	
	List<User> getAllUsers();
	
	User getUserByUserId(Long id);
	
	void deleteUser(Long id);
	
	User updateUser(User user);
}
