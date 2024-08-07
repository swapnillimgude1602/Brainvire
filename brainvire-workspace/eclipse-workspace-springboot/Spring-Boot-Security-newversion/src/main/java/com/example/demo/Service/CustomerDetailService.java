package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.CustomerDetails;
import com.example.demo.Repository.CustomerRepository;

@Component
public class CustomerDetailService implements UserDetailsService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Customer customer = this.customerRepository.findByCustomerFirstName(username);
		if(customer==null) {
			throw new UsernameNotFoundException("User-not Found");
		}
		return new CustomerDetails(customer);
	}
 
}
