package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class CustomerUserServiceImplementation implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	public CustomerUserServiceImplementation(UserRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("user not found with email");
		}
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
	}

}
