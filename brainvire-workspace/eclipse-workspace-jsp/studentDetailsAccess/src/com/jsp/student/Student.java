package com.jsp.student;

public class Student {
	 private String firstName;
	 private String lastName;
	 private boolean boldStudent;
	 
//	 public Student() {
//		 
//	 }
	public Student(String firstName, String lastName, boolean boldStudent) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.boldStudent = boldStudent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isBoldStudent() {
		return boldStudent;
	}
	public void setBoldStudent(boolean boldStudent) {
		this.boldStudent = boldStudent;
	}
	 
		
	
	
	
	
}

