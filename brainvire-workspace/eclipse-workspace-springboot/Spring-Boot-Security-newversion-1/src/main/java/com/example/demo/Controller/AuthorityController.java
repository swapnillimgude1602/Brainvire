package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("/check")
public class AuthorityController {

	@Autowired
	private CustomerService customerService;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/home")
	public String home() {
		return "i am back home";
	}
	
	@PreAuthorize("hasAuthority('USER')")
	@GetMapping("/show")
	public List<Customer> getAllCustomers() {
		List<Customer> showAllCustomers = this.customerService.getAllCustomers();
		return showAllCustomers;
	}

}