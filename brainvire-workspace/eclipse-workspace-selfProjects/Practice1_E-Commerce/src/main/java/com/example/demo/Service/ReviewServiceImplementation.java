package com.example.demo.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Product;
import com.example.demo.Model.Review;
import com.example.demo.Model.User;
import com.example.demo.Repository.ReviewRepository;
import com.example.demo.Request.ReviewRequest;

@Service
public class ReviewServiceImplementation implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private ProductService productService;

	public ReviewServiceImplementation(ReviewRepository reviewRepository, ProductService productService) {
		super();
		this.reviewRepository = reviewRepository;
		this.productService = productService;
	}

	@Override
	public Review createReview(ReviewRequest request, User user) throws ProductException {
		// TODO Auto-generated method stub

		Product product = productService.findProductById(request.getProductId());
		Review review = new Review();
		review.setUser(user);
		review.setProduct(product);
		review.setReview(request.getReview());
		review.setCreatedAt(LocalDateTime.now());

		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReview(Long productId) {
		// TODO Auto-generated method stub
		return reviewRepository.getAllProductsReview(productId);
	}

}
