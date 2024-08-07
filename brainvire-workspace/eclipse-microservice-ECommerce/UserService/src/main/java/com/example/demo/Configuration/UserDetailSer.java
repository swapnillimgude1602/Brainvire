package com.example.demo.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.Model.User;
import com.example.demo.Model.UserDet;
import com.example.demo.Repository.UserRepository;

@Component
public class UserDetailSer implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = this.userRepository.findByUserFirstName(username);
		if(user==null) {
			throw new UsernameNotFoundException("User-not Found");
		}
		return new UserDet(user);
	}
 
}