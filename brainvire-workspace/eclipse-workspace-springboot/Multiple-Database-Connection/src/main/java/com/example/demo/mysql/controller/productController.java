package com.example.demo.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mysql.entities.Product;
import com.example.demo.mysql.repositories.productRepository;

@RestController
public class productController {
	
	@Autowired
	private productRepository productRepo;
	
	@PostMapping("/addProd")
	public Product addProduct(@RequestBody Product product) {
		Product add = this.productRepo.save(product);
		return add;
	}

}
