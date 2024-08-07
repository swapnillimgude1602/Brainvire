package com.example.demo.External.Services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entiy.UserRating;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingServices {

	@PostMapping("/ratings")
	UserRating createRating(UserRating values);
	
	@GetMapping("/user/{userId}")
	UserRating getUserRating(@PathVariable("userId") String userId);
	
	

}
