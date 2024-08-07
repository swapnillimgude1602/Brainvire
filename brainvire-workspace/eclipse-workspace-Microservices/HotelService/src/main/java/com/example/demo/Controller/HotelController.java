package com.example.demo.Controller;

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

import com.example.demo.Entity.HotelEntity;
import com.example.demo.Service.HotelServiceImpl;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelServiceImpl hotelServiceImpl;

	@PostMapping
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotelEntity) {
		HotelEntity create = this.hotelServiceImpl.saveHotel(hotelEntity);
		return new ResponseEntity<HotelEntity>(create, HttpStatus.CREATED);
	}

	
	@GetMapping("/{hotelid}")
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
//	@PreAuthorize("hasAuthority('Admin')")
	public ResponseEntity<HotelEntity> getHotel(@PathVariable("hotelid") String hotelid) {
		return ResponseEntity.status(HttpStatus.OK).body(this.hotelServiceImpl.getHotel(hotelid));
	}

	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<HotelEntity>> getAllHotels() {
		List<HotelEntity> getHotels = this.hotelServiceImpl.getAllHotels();
		return ResponseEntity.status(HttpStatus.OK).body(getHotels);
	}

	@PutMapping("/{hotelid}")
	public ResponseEntity<HotelEntity> updateHotel(@RequestBody HotelEntity hotelEntity, @PathVariable String hotelid) {
		HotelEntity update = this.hotelServiceImpl.updateHotel(hotelEntity, hotelid);
		return ResponseEntity.status(HttpStatus.OK).body(update);
	}

	@DeleteMapping("/{hotelid}")
	public void deleteHotel(@PathVariable String hotelid) {
		this.hotelServiceImpl.deleteHotel(hotelid);
	}
}
