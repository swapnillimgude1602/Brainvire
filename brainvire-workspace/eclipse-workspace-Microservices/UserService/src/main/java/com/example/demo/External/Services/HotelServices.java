package com.example.demo.External.Services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entiy.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelServices {

	@GetMapping("/hotel/{hotelId}")
	Hotel getHotel(@PathVariable("hotelId") String hotelId);
}	
