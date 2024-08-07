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

import com.example.demo.DTO.Address;
import com.example.demo.Model.User;
import com.example.demo.Service.AddressService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/ecommerce/user")
public class UserController {

	@Autowired
	private AddressService addressService;
	@Autowired
	private UserService userService;
	
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
	public void deleteAddress(@PathVariable("deleteid") Long deleteid) {
		this.addressService.deleteAddress(deleteid);
	}
	
	@GetMapping("/show")
	public List<User> getAllusers() {
		List<User> showAllUsers = this.userService.getAllUsers();
		return showAllUsers;
	}
	

}
