package com.usermanagement.Model;

public class User {
	private int userId;
	private String userName;
	private String emailId;
	private String country;
	
	public User(String userName, String emailId, String country) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.country = country;
	}
	
	public User(int userId, String userName, String emailId, String country) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.country = country;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
