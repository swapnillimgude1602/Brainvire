package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Request.CreateProductRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		List<Product> findAll = productRepository.findAll();
		return findAll;
	}

	@Override
	public Product createProduct(CreateProductRequest request) {
		// TODO Auto-generated method stub
		Category topLevel = categoryRepository.findByName(request.getTopLevelCategory());
		if (topLevel == null) {
			Category topLevelCategory = new Category();
			topLevelCategory.setName(request.getTopLevelCategory());
			log.info("name {}", topLevelCategory.getName());
			topLevelCategory.setParentCategory(topLevel);
			topLevelCategory.setLevel(1);
			topLevel = categoryRepository.save(topLevelCategory);

		}

		Category secondLevel = categoryRepository.findByNameAndParent(request.getSecondLevelCategory(),
				topLevel.getName());
		if (secondLevel == null) {
			Category secondLevelCategory = new Category();
			secondLevelCategory.setName(request.getSecondLevelCategory());
			secondLevelCategory.setParentCategory(topLevel);
			secondLevelCategory.setLevel(2);
			secondLevel = categoryRepository.save(secondLevelCategory);
		}

		Category thirdLevel = categoryRepository.findByNameAndParent(request.getThirdLevelCategory(),
				secondLevel.getName());

		if (thirdLevel == null) {
			Category thirdLevelCategory = new Category();
			thirdLevelCategory.setName(request.getThirdLevelCategory());
			thirdLevelCategory.setParentCategory(secondLevel);
			thirdLevelCategory.setLevel(3);
			thirdLevel = categoryRepository.save(thirdLevelCategory);

		}

		Product product = new Product();
		product.setTitle(request.getTitle());
		product.setColor(request.getColor());
		product.setDescription(request.getDescription());
		product.setDiscountedPrice(request.getDiscountedPrice());
		product.setDiscountPercent(request.getDiscountPercent());
		product.setImageUrl(request.getImageUrl());
		product.setBrand(request.getBrand());
		product.setPrice(request.getPrice());
		product.setSizes(request.getSize());
		product.setQuantity(request.getQuantity());
		product.setCategory(thirdLevel);

		Product saveProduct = productRepository.save(product);

		return saveProduct;
	}

	@Override
	public String deleteProduct(Long id) throws ProductException {
		// TODO Auto-generated method stub
		Product product = findProductById(id);
		product.getSizes().clear();
		productRepository.delete(product);

		return "Product Deleted Successfully..!";
	}

	@Override
	public Product updateProduct(Long id, Product request) throws ProductException {
		// TODO Auto-generated method stub
		Product product = findProductById(id);
		if (request.getQuantity() != 0) {
			product.setQuantity(request.getQuantity());
		}

		return productRepository.save(product);
	}

	@Override
	public Product findProductById(Long id) throws ProductException {
		// TODO Auto-generated method stub
		Optional<Product> opt = productRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new ProductException("Product Not Found with id: " + id);
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProduct(String Category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNumber, pageSize);

		List<Product> products = productRepository.filterProducts(Category, minPrice, maxPrice, minDiscount, sort);
		if (!colors.isEmpty()) {
			products = products.stream().filter(p -> colors.stream().anyMatch(c -> c.equalsIgnoreCase(p.getColor())))
					.collect(Collectors.toList());
		}

		if (stock != null) {
			if (stock.equals("in_stock")) {
				products = products.stream().filter(p -> p.getQuantity() > 0).collect(Collectors.toList());
			} else if (stock.equals("out_of_stock")) {
				products = products.stream().filter(p -> p.getQuantity() < 1).collect(Collectors.toList());
			}
		}

		int startIndex = (int) pageable.getOffset(); // Skip the sets
		int endIndex = Math.min(startIndex + pageable.getPageSize(), products.size());
		List<Product> pageContent = products.subList(startIndex, endIndex);
		Page<Product> filterProducts = new PageImpl<Product>(pageContent, pageable, products.size());
		return filterProducts;
	}

}
