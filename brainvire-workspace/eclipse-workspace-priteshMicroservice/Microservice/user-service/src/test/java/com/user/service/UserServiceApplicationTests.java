package com.user.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.user.service.entities.Rating;
import com.user.service.service.feignclient.service.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

	Logger log = LoggerFactory.getLogger(UserServiceApplicationTests.class);
	
	@Autowired
	RatingService ratingService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void CreateRating() {
		Rating rating = Rating.builder().hotelId(3L).feedback("test").rating(5).ratingId(5L).userId(1L).hotel(null).build();
		ResponseEntity<Rating> ratingData = ratingService.createRating(rating);
		log.info("ratingData is : " + ratingData.toString());
	}

}
