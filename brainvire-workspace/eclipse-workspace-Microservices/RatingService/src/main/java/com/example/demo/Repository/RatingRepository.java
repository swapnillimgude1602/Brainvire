package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.RatingEntity;

@Repository
public interface RatingRepository extends MongoRepository<RatingEntity, String>{

	List<RatingEntity> getByUserId(String userId);
	List<RatingEntity> getByHotelId(String hotelId);
}
