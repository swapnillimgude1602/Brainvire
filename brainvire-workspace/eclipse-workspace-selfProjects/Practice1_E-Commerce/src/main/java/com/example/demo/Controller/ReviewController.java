package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ProductException;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.Review;
import com.example.demo.Model.User;
import com.example.demo.Request.ReviewRequest;
import com.example.demo.Service.ReviewServiceImplementation;
import com.example.demo.Service.UserServiceImplementation;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

	@Autowired
	private ReviewServiceImplementation reviewService;
	@Autowired
	private UserServiceImplementation userService;

	@PostMapping("/create")
	public ResponseEntity<Review> createReviewReview(@RequestBody ReviewRequest request,
			@RequestHeader("Authorization") String jwt) throws UserException, ProductException {
		User user = userService.findUserProfileByJwt(jwt);
		Review review = reviewService.createReview(request, user);
		return new ResponseEntity<Review>(review, HttpStatus.CREATED);

	}

	@GetMapping("/product/{productid}")
	public ResponseEntity<List<Review>> getProductsReview(@PathVariable("productid") Long productid)
			throws UserException, ProductException {
		List<Review> reviews = reviewService.getAllReview(productid);
		return new ResponseEntity<List<Review>>(reviews, HttpStatus.ACCEPTED);

	}
}
