package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Configuration.JwtProvider;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private JwtProvider jwtProvider;

	public UserServiceImplementation(UserRepository repository, JwtProvider jwtProvider) {
		super();
		this.repository = repository;
		this.jwtProvider = jwtProvider;
	}

	@Override
	public User findUserById(Long userId) throws UserException {
		// TODO Auto-generated method stub
		Optional<User> user = repository.findById(userId);
		if (user.isPresent()) {
			return user.get();
		}
		throw new UserException("User not found with id" + userId);

	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		// TODO Auto-generated method stub
		String email = jwtProvider.getEmailFromToken(jwt);
		User user = repository.findByEmail(email);
		if (user == null) {
			throw new UserException("user not found with email: " + email);
		}
		return user;
	}

}
