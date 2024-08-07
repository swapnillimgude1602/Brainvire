package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public User saveUser(User user) {
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		log.info("pass{}",user.getPassword());
		User insert = this.userRepository.save(user);
		return insert;
	}

	public User updateUser(User user, long userId) {
		user.setUserId(userId);
		return this.userRepository.save(user);
	}

	public List<User> getAllUsers() {
		List<User> users = this.userRepository.findAll();
		return users;
	}

	public User getUserById(Long userId) {
		User user = this.userRepository.getByUserId(userId);
		return user;
	}

	public User getUserByName(String name) {
		User username = this.userRepository.getByUserFirstName(name);
		return username;
	}

	public void deleteUser(long userId) {
		this.userRepository.deleteById(userId);
	}

}
