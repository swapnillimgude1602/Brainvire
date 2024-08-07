package com.example.demo.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.RatingEntity;
import com.example.demo.Repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingServiceIf {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public RatingEntity create(RatingEntity ratingEntity) {
		// TODO Auto-generated method stub
		String randomUuid = UUID.randomUUID().toString();
		ratingEntity.setRatingId(randomUuid);
		RatingEntity createRating = this.ratingRepository.save(ratingEntity);
		return createRating;
	}

	@Override
	public List<RatingEntity> getAllRatings() {
		// TODO Auto-generated method stub
		List<RatingEntity> getAll = this.ratingRepository.findAll();
		return getAll;
	}

	@Override
	public List<RatingEntity> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		List<RatingEntity> getRating = this.ratingRepository.getByUserId(userId);
		return getRating;
	}

	@Override
	public List<RatingEntity> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		List<RatingEntity> getRating = this.ratingRepository.getByHotelId(hotelId);
		return getRating;
	}

}
