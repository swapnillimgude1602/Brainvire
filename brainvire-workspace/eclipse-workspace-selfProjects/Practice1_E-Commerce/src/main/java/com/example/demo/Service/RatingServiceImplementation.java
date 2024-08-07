package com.example.demo.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Product;
import com.example.demo.Model.Rating;
import com.example.demo.Model.User;
import com.example.demo.Repository.RatingRepository;
import com.example.demo.Request.RatingRequest;

@Service
public class RatingServiceImplementation implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	@Autowired
	private ProductService productService;
	

	public RatingServiceImplementation(RatingRepository ratingRepository, ProductService productService) {
		super();
		this.ratingRepository = ratingRepository;
		this.productService = productService;
	}

	@Override
	public Rating createRating(RatingRequest request, User user) throws ProductException {
		// TODO Auto-generated method stub
		Product product = productService.findProductById(request.getProductId());
		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(request.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		// TODO Auto-generated method stub
		return ratingRepository.getAllProductsRatings(productId);
	}

}
