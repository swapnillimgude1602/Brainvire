package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.HotelEntity;

public interface HotelServiceIf {

	HotelEntity saveHotel(HotelEntity hotelEntity);

	List<HotelEntity> getAllHotels();

	HotelEntity getHotel(String hotelId);

	HotelEntity updateHotel(HotelEntity hotelEntity, String hotelId);

	void deleteHotel(String hotelId);

}
