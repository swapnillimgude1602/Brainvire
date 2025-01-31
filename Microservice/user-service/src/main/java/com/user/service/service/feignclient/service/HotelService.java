package com.user.service.service.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.service.entities.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

	@GetMapping(path = "/hotels/{id}")
	Hotel getHotelById(@PathVariable("id") Long id);
}
