package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	public Customer getByCustomerId(Long customerId);
	public Customer getByCustomerFirstName(String name);
	public Customer findByCustomerFirstName(String username);

	
}
