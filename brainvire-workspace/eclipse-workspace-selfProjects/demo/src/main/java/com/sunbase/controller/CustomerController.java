package com.sunbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbase.entity.Customer;
import com.sunbase.service.CustomerServiceImpl;


@RestController
@RequestMapping("/sunbase")
public class CustomerController {
	@Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/addcust")
    public Customer saveCustomer(@RequestBody Customer customer) {
    	Customer save = this.customerService.addCustomer(customer);
    	return save;
    }
    
}
