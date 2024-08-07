package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.RatingEntity;
import com.example.demo.Service.RatingServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingServiceImpl ratingService;

	
	@PostMapping
	@PreAuthorize("hasAuthority('Admin')")
	public ResponseEntity<RatingEntity> saveRating(@RequestBody RatingEntity ratingEntity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.ratingService.create(ratingEntity));
	}

	@GetMapping
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<RatingEntity>> getAllRating() {
		List<RatingEntity> getAll = this.ratingService.getAllRatings();
		return ResponseEntity.status(HttpStatus.OK).body(getAll);
	}

	
	@GetMapping("/user/{userId}")
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<RatingEntity>> getbyuserId(@PathVariable("userId") String userId) {
		List<RatingEntity> getRating = this.ratingService.getRatingByUserId(userId);
		return new ResponseEntity<List<RatingEntity>>(getRating, HttpStatus.OK);
	}
	
	@GetMapping("/hotel/{hotelId}")
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<RatingEntity>> getbyhotelId(@PathVariable("hotelId") String hotelId) {
		List<RatingEntity> getRating = this.ratingService.getRatingByHotelId(hotelId);
		return new ResponseEntity<List<RatingEntity>>(getRating, HttpStatus.OK);
	}

}
