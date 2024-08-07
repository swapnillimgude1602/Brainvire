package com.springcore.auto.wire;

public class Address {
	
	private String city;
	private String State;
	private String pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String city, String state, String pinCode) {
		super();
		this.city = city;
		this.State = state;
		this.pinCode = pinCode;
	}
	
	
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pinCode=" + pinCode + "]";
	}
	
	
}
