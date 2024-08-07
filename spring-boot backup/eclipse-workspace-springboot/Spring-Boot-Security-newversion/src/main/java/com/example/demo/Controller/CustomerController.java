package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/save")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.customerService.saveCustomer(customer);
	}

	@GetMapping("/show/{customerid}")
	public Customer getCustomer(@PathVariable("customerid") long customerid) {
		return this.customerService.getCustomerById(customerid);
	}

	@GetMapping("/show")
	public List<Customer> getAllCustomers() {
		List<Customer> showAllCustomers = this.customerService.getAllCustomers();
		return showAllCustomers;
	}

	@PutMapping("/update/{customerid}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("customerid") long customerid) {
		return this.customerService.updateCustomer(customer, customerid);
	}

	@GetMapping("/show/{customername}")
	@PreAuthorize("hasAuthority('ADMIN')")
	public Customer getCustomer(@PathVariable("customername") String customername) {
		return this.customerService.getCustomerByName(customername);
	}

	@DeleteMapping("/delete/{customerid}")
	public void deleteCustomer(@PathVariable("customerid") long customerid) {
		this.customerService.deleteCustomer(customerid);
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/home")
	public String home() {
		return "i am back home";
	}
}
