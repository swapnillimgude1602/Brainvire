package com.example.demo.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.HotelEntity;
import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelServiceIf {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public HotelEntity saveHotel(HotelEntity hotelEntity) {
		String ranUuid = UUID.randomUUID().toString();
		hotelEntity.setHotelId(ranUuid);
		HotelEntity create = this.hotelRepository.save(hotelEntity);
		return create;
	}

	@Override
	public List<HotelEntity> getAllHotels() {
		// TODO Auto-generated method stub
		List<HotelEntity> getAll = this.hotelRepository.findAll();
		return getAll;
	}

	@Override
	public HotelEntity getHotel(String hotelId) {
		// TODO Auto-generated method stub
		return this.hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No user Found on Server" + hotelId));

	}

	@Override
	public HotelEntity updateHotel(HotelEntity hotelEntity, String hotelId) {
		// TODO Auto-generated method stub
		hotelEntity.setHotelId(hotelId);
		HotelEntity update = this.hotelRepository.save(hotelEntity);
		return update;
	}

	@Override
	public void deleteHotel(String hotelId) {
		// TODO Auto-generated method stub
		this.hotelRepository.deleteById(hotelId);
		System.out.println("Hotel deleted sucessfully");

	}

}
