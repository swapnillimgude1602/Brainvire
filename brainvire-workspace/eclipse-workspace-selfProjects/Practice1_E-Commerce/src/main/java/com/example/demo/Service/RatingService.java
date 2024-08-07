package com.example.demo.Service;

import java.util.List;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Rating;
import com.example.demo.Model.User;
import com.example.demo.Request.RatingRequest;

public interface RatingService {
	
	public Rating createRating(RatingRequest request, User user) throws ProductException;
	public List<Rating> getProductsRating(Long productId);

}	
