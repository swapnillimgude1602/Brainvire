package com.user.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.entities.Hotel;
import com.user.service.entities.Rating;
import com.user.service.entities.User;
import com.user.service.exception.UserNotFoundException;
import com.user.service.repositories.UserRepository;
import com.user.service.service.UserService;
import com.user.service.service.feignclient.service.HotelService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	HotelService hotelService;

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserByUserId(Long id) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User Not Found Exception"));

		
		// Rest Template
		Rating[] reating = restTemplate.getForObject("http://RATING-SERVICE/ratings/users/" + user.getUserId(),
				Rating[].class);
		List<Rating> ratingList = Arrays.stream(reating).toList();
		logger.info("reating is : " + reating);

		List<Rating> finalRatingList = ratingList.stream().map(rating -> {
			logger.info("" + rating.toString());
			ResponseEntity<Hotel> hotel = restTemplate
					.getForEntity("http://HOTEL-SERVICE/hotels/" + rating.getHotelId(), Hotel.class);
			Hotel hotelData = hotel.getBody();

			rating.setHotel(hotelData);
			return rating;
		}).collect(Collectors.toList());

		// call the thied party API from the REST Template
//		ResponseEntity<Rating> reating = restTemplate.getForEntity("http://localhost:8083/ratings/"+ user.getUserId(),Rating.class);
//		logger.info("reating is : " + reating.getBody());
		user.setRatings(finalRatingList);

		
		
		
		// feign Client
		Hotel hotel = hotelService.getHotelById(1L);
		logger.info("Hotel is : " + hotel.toString());

		
		
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

}
