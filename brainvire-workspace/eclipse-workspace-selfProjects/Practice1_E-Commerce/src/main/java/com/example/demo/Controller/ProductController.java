package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Product;
import com.example.demo.Service.ProductServiceImplementation;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductServiceImplementation productService;

	@GetMapping("/products")
	public ResponseEntity<Page<Product>> findProductByCategoryHandler(@RequestParam String category,
			@RequestParam List<String> color, @RequestParam List<String> size, @RequestParam Integer minPrice,
			@RequestParam Integer maxPrice, @RequestParam Integer minDiscount, @RequestParam String sort,
			@RequestParam String stock, @RequestParam Integer paeNumber, @RequestParam Integer pageSize) {

		Page<Product> res = productService.getAllProduct(category, color, size, minPrice, maxPrice, minDiscount, sort,
				stock, paeNumber, pageSize);
		System.out.println("Complete Products");
		return new ResponseEntity<Page<Product>>(res, HttpStatus.ACCEPTED);

	}

	@GetMapping("/products/id/{productid}")
	public ResponseEntity<Product> findProductByIdHandler(@PathVariable Long productid) throws ProductException {
		Product product = productService.findProductById(productid);
		return new ResponseEntity<Product>(product, HttpStatus.ACCEPTED);
	}
}
