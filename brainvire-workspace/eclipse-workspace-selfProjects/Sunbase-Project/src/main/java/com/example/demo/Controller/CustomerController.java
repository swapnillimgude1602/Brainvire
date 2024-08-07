package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/sunbase")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/save")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer save = this.customerService.addCustomer(customer);
		return save;
	}

	@GetMapping("/")
	public List<Customer> getCustomers() {
		List<Customer> getAll = this.customerService.getCustomers();
		return getAll;
	}

	@PutMapping("/update/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("id") int id) {
		Customer update = this.customerService.update(customer, id);
		return update;
	}

	@DeleteMapping("/id/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		this.customerService.deleteCustomer(id);
	}

	@GetMapping("/fname/{firstName}")
	public Customer getByCustomerfirstName(@PathVariable("firstName") String firstName) {
		return this.customerService.getCustomerbyfirstName(firstName);
	}

	@GetMapping("/lname/{lastName}")
	public Customer getByCustomerlastName(@PathVariable("lastName") String lastName) {
		return this.customerService.getCustomerbyLastName(lastName);
	}

	@GetMapping("/getid/{id}")
	public Customer getByCustomerId(@PathVariable int id) {
		return this.customerService.getCustomerbyId(id);
	}
}
