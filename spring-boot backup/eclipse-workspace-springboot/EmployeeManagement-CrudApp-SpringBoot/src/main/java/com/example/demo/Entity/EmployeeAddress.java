package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private int pincode;
	private String city;
	private String district;
	private String state;

	public EmployeeAddress(int aid, String city, String district, String state, int pincode) {
		super();
		this.aid = aid;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public EmployeeAddress() {

	}

	public int getaID() {
		return aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [aid=" + aid + ", pincode=" + pincode + ", city=" + city + ", district=" + district
				+ ", state=" + state + "]";
	}

}
