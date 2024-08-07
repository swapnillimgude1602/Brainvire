package com.sunbase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbase.entity.Customer;
import com.sunbase.repository.CustomerRepository;

@Service
public class CustomerServiceImpl{

	@Autowired
	private CustomerRepository customerRepository;
	public Customer addCustomer(Customer customer) {
		Customer add = this.customerRepository.save(customer);
		return add;
	}

}
