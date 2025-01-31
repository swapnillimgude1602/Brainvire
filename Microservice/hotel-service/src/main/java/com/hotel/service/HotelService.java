package com.hotel.service;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
	
	Hotel addHotel(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotelById(Long id);
	
	Hotel updateHotel(Hotel hotel);
	
	void deleteHotel(Long id);
}
