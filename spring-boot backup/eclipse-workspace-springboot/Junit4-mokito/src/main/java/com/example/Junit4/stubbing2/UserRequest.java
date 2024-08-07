package com.example.Junit4.stubbing2;

public class UserRequest {

	private String userName;
	private String userAddress;
	private String userPassword;
	private int userPayment;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(int userPayment) {
		this.userPayment = userPayment;
	}

	public UserRequest(String userName, String userAddress, String userPassword, int userPayment) {
		super();
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPassword = userPassword;
		this.userPayment = userPayment;
	}

	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
