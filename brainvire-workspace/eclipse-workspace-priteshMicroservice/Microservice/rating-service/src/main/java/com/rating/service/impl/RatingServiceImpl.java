package com.rating.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entities.Rating;
import com.rating.exeception.RatingNotFoundException;
import com.rating.repositories.RatingRepository;
import com.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingRepository ratingRepository;

	@Override
	public Rating addRating(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating getRatingById(Long ratingId) {
		// TODO Auto-generated method stub
		Rating rating = ratingRepository.findByRatingId(ratingId);
		if(rating!=null) {
			return rating;
		}
		throw new RatingNotFoundException("Rating Not Found");
	}

	@Override
	public Rating updateRating(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	@Override
	public Rating deleteRating(Long ratingId) {
		// TODO Auto-generated method stub
		Rating rating = ratingRepository.findByRatingId(ratingId);
		ratingRepository.deleteByRatingId(ratingId);
		return rating;
	}

	@Override
	public List<Rating> getRatingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingsByHotelId(Long hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
