package com.user.service.service.feignclient.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.service.entities.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

	@PostMapping(path = "/ratings")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating);

	@GetMapping(path = "/ratings")
	public ResponseEntity<List<Rating>> getAllRatings();

	@GetMapping(path = "/ratings/{ratingId}")
	public ResponseEntity<Rating> getRatingsById(@PathVariable("ratingId") Long ratingId);

	@PutMapping(path = "/ratings")
	public ResponseEntity<Rating> updateRating(@RequestBody Rating rating);

	@DeleteMapping(path = "/ratings/{ratingId}")
	public ResponseEntity<Rating> deleteRatingsById(@PathVariable("ratingId") Long ratingId);

	@GetMapping(path = "/ratings/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable("hotelId") Long hotelId);

	@GetMapping(path = "/ratings/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable("userId") Long userId);
}
