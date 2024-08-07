package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.CustomerDetails;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerDetailService implements UserDetailsService{

	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public UserDetails loadUserByUsername(@RequestBody String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Customer customer = this.customerRepository.findByCustomerFirstName(username);
		
		//had an error
		if(customer==null) {
			throw new UsernameNotFoundException("User-not Found");
		}
		return new CustomerDetails(customer);
	}
	
	
 
}
