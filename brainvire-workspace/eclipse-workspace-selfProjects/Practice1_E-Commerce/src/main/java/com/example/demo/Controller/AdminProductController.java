package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Product;
import com.example.demo.Request.CreateProductRequest;
import com.example.demo.Response.ApiResponse;
import com.example.demo.Service.ProductServiceImplementation;

@RestController
@RequestMapping("api/admin/products")
public class AdminProductController {

	@Autowired
	private ProductServiceImplementation productService;

	@PostMapping("/")
	public ResponseEntity<Product> createProduct(@RequestBody CreateProductRequest request) {
		
		Product product = productService.createProduct(request);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}

	@DeleteMapping("/{productId}/delete")
	public ResponseEntity<ApiResponse> deletProduct(@PathVariable("productId") Long productId) throws ProductException {

		productService.deleteProduct(productId);

		ApiResponse res = new ApiResponse();
		res.setMessage("Product Deleted Successfully");
		res.setStatus(true);

		return new ResponseEntity<ApiResponse>(res, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAllProduct() {
		List<Product> list = productService.findAllProducts();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@PostMapping("/creates")
	public ResponseEntity<ApiResponse> createMultipleProduct(@RequestBody CreateProductRequest[] request)
			throws ProductException {

		for (CreateProductRequest product : request) {
			productService.createProduct(product);
		}

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage("Product Created Successfully");
		apiResponse.setStatus(true);

		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.CREATED);
	}

}
