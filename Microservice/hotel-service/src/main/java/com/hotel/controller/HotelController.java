package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping(path = "/hotels")
public class HotelController {

	@Autowired
	HotelService hotelService;

	@PostMapping
	@PreAuthorize("hasAuthority('Admin')")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel hotelEntity = hotelService.addHotel(hotel);
		return new ResponseEntity<Hotel>(hotelEntity, HttpStatus.CREATED);
	}

	@GetMapping
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Hotel>> getAllHotel() {
		List<Hotel> hotelEntity = hotelService.getAllHotel();
		return new ResponseEntity<List<Hotel>>(hotelEntity, HttpStatus.OK);
	}

	
	// user PreAuthorized that is called from the Internal API not called Directly	
	@GetMapping(path = "/{id}")
	@PreAuthorize("hasAuthority('SCOPE_internal')")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("id") Long id) {
		Hotel hotelEntity = hotelService.getHotelById(id);
		return new ResponseEntity<Hotel>(hotelEntity, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) {
		Hotel hotelEntity = hotelService.addHotel(hotel);
		return new ResponseEntity<Hotel>(hotelEntity, HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Hotel> deleteHotelById(@PathVariable("id") Long id) {
		Hotel hotelEntity = hotelService.getHotelById(id);
		hotelService.deleteHotel(id);
		return new ResponseEntity<Hotel>(hotelEntity, HttpStatus.OK);
	}
}
