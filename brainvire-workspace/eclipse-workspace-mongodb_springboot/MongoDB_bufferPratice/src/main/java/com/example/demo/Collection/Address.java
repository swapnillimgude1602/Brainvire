package com.example.demo.Collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
	
	private int addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int pincode;


}
