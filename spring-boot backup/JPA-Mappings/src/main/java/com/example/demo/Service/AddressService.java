package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Address;
import com.example.demo.Repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address addAddress(Address address) {
		Address insertAddress = this.addressRepository.save(address);
		System.out.println("--Address Inserted--");
		return insertAddress;
	}

	public List<Address> getAllAddress() {
		List<Address> getAddress = this.addressRepository.findAll();
		return getAddress;
	
	}
	
	public Address updateAddress(Address address, int addressid) {
		address.setAddressId(addressid);
		Address update = this.addressRepository.save(address);
		System.out.println("--Address Updated--");
		return update;
	}

	public void deleteAddress(int addressid) {
		this.addressRepository.deleteById(addressid);
		System.out.println("--Address deleted--");
	}
}
