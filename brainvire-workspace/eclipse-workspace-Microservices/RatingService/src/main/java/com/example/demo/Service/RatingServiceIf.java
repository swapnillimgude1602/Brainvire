package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.RatingEntity;

public interface RatingServiceIf {
	
	RatingEntity create(RatingEntity ratingEntity);
	List<RatingEntity> getAllRatings();
	List<RatingEntity> getRatingByUserId(String userId);
	List<RatingEntity> getRatingByHotelId(String hotelId);

	

}
