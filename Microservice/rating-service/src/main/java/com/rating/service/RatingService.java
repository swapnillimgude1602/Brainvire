package com.rating.service;

import java.util.List;

import com.rating.entities.Rating;

public interface RatingService {

	Rating addRating(Rating rating);

	List<Rating> getAllRatings();

	Rating getRatingById(Long ratingId);

	Rating updateRating(Rating rating);

	Rating deleteRating(Long ratingId);

	List<Rating> getRatingByUserId(Long userId);

	List<Rating> getRatingsByHotelId(Long hotelId);

}
