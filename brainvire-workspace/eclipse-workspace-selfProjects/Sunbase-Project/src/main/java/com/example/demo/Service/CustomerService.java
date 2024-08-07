package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {
		Customer add = this.customerRepository.save(customer);
		return add;
	}

	public List<Customer> getCustomers() {
		List<Customer> get = this.customerRepository.findAll();
		return get;
	}

	public Customer update(Customer customer, int custId) {
		customer.setCustomerId(custId);
		Customer cust = this.customerRepository.save(customer);
		return cust;
	}

	public void deleteCustomer(int customerId) {
		this.customerRepository.deleteById(customerId);
	}

	public Customer getCustomerbyId(int customerId) {
		Customer cust = this.customerRepository.getByCustomerId(customerId);
		return cust;
	}

	public Customer getCustomerbyfirstName(String customerFname) {
		Customer fname = this.customerRepository.getByFirstName(customerFname);
		return fname;
	}

	public Customer getCustomerbyLastName(String lastName) {
		Customer lname = this.customerRepository.getByLastName(lastName);
		return lname;
	}
}
