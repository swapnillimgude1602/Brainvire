package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Address;
import com.example.demo.Service.AddressService;

@RestController
@RequestMapping("/address")

public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address) {

		Address add = this.addressService.addAddress(address);
		return add;
	}

	@GetMapping("/getAddress")
	public List<Address> getAddress() {
		List<Address> getAllAddress = this.addressService.getAllAddress();
		return getAllAddress;

	}

	@PutMapping("/updateAddress/{addressid}")
	public Address updateAddress(@RequestBody Address address, @PathVariable("addressid") int addressid) {
		Address update = this.addressService.updateAddress(address, addressid);
		return update;
	}

	@DeleteMapping("/deleteAddress/{deleteid}")
	public void deleteAddress(@PathVariable("deleteid") int deleteid) {
		this.addressService.deleteAddress(deleteid);
	}
}
