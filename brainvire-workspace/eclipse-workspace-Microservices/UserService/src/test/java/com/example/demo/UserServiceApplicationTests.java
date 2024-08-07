package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Entiy.UserRating;
import com.example.demo.External.Services.RatingServices;
import com.netflix.discovery.converters.Auto;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Autowired
//	private RatingServices ratingServices;
//
//	@Test
//	void creeateRating() {
//	UserRating rating = UserRating.builder().rating(5).userId("").hotelId("")
//			.feedback("This is best Hotel created feign client").build();
//	ratingServices.createRating(rating);
//	System.out.println("Created new Rating");
//	}
}