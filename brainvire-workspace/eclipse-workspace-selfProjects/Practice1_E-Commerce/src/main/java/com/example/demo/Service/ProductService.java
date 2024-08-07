package com.example.demo.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Product;
import com.example.demo.Request.CreateProductRequest;

public interface ProductService {
	
	public List<Product> findAllProducts();

	public Product createProduct(CreateProductRequest request);

	public String deleteProduct(Long id) throws ProductException;

	public Product updateProduct(Long id, Product request) throws ProductException;

	public Product findProductById(Long id) throws ProductException;

	public List<Product> findProductByCategory(String category);

	public Page<Product> getAllProduct(String Category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize	);

}
