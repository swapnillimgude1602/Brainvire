package com.example.demo.Service;

import java.util.List;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Review;
import com.example.demo.Model.User;
import com.example.demo.Request.ReviewRequest;

public interface ReviewService {
	
	public Review createReview(ReviewRequest request, User user) throws ProductException;
	public List<Review> getAllReview(Long productId);

}
