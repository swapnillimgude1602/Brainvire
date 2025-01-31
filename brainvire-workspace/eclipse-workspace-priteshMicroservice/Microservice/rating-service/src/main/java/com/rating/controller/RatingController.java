package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entities.Rating;
import com.rating.service.RatingService;

@RestController
@RequestMapping(path = "/ratings")
public class RatingController {

	@Autowired
	RatingService ratingService;

	@PostMapping
	@PreAuthorize("hasAuthority('Admin')")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		Rating ratingDTO = ratingService.addRating(rating);
		return new ResponseEntity<Rating>(ratingDTO, HttpStatus.CREATED);
	}

	@GetMapping
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Rating>> getAllRatings() {
		List<Rating> ratingDTO = ratingService.getAllRatings();
		return new ResponseEntity<List<Rating>>(ratingDTO, HttpStatus.OK);
	}

	@GetMapping(path = "/{ratingId}")
	public ResponseEntity<Rating> getRatingsById(@PathVariable("ratingId") Long ratingId) {
		Rating ratingDTO = ratingService.getRatingById(ratingId);
		return new ResponseEntity<Rating>(ratingDTO, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Rating> updateRating(@RequestBody Rating rating) {
		Rating ratingDTO = ratingService.updateRating(rating);
		return new ResponseEntity<Rating>(ratingDTO, HttpStatus.OK);
	}

	@DeleteMapping(path = "/{ratingId}")
	public ResponseEntity<Rating> deleteRatingsById(@PathVariable("ratingId") Long ratingId) {
		Rating ratingDTO = ratingService.deleteRating(ratingId);
		return new ResponseEntity<Rating>(ratingDTO, HttpStatus.OK);
	}

	@GetMapping(path = "/hotels/{hotelId}")
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable("hotelId") Long hotelId) {
		List<Rating> ratingDTO = ratingService.getRatingsByHotelId(hotelId);
		return new ResponseEntity<List<Rating>>(ratingDTO, HttpStatus.OK);
	}

	@GetMapping(path = "/users/{userId}")
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable("userId") Long userId) {
		List<Rating> ratingDTO = ratingService.getRatingByUserId(userId);
		return new ResponseEntity<List<Rating>>(ratingDTO, HttpStatus.OK);
	}
}
