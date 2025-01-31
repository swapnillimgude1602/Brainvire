package com.example.demo.Service.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.SignupRequest;
import com.example.demo.Dto.UserDto;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.enums.UserRole;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createCustomer(SignupRequest signuprequest) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(signuprequest.getName());
		user.setEmail(signuprequest.getEmail());
		user.setPassword(signuprequest.getPassword());
		user.setUserRole(UserRole.Customer);
		User createdUser = userRepository.save(user);
		UserDto userDto = new UserDto();
		userDto.setId(createdUser.getId());
		return userDto;
	}

	@Override
	public boolean hasCustomerWtihEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findFirstByEmail(email).isPresent();
	}
}
