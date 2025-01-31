package com.rating.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, Long> {

	public Rating deleteByRatingId(Long ratingId);

	Rating findByRatingId(Long ratingId);

	// custome method for find rating by userId and find hotel by userid
	List<Rating> findByUserId(Long userId);

	List<Rating> findByHotelId(Long hotelId);
}
