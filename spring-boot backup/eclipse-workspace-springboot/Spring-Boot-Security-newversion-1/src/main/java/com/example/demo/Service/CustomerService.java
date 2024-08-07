package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public Customer saveCustomer(Customer customer) {
		customer.setPassword(this.bCryptPasswordEncoder.encode(customer.getPassword()));
		Customer insert = this.customerRepository.save(customer);
		return insert;
	}

	public Customer updateCustomer(Customer customer, long customerId) {
		customer.setCustomerId(customerId);
		return this.customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = this.customerRepository.findAll();
		return customers;
	}
	
	public Customer getCustomerById(Long customerId) {
		Customer customer = this.customerRepository.getByCustomerId(customerId);
		return customer;
	}
	
	public Customer getCustomerByName(String name) {
		Customer customername = this.customerRepository.getByCustomerFirstName(name);
		return customername;
	}
	
	public void deleteCustomer(long customerId) {
		this.customerRepository.deleteById(customerId);
	}

}

