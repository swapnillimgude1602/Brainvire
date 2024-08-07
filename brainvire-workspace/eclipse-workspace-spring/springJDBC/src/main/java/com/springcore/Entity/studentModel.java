package com.springcore.Entity;


public class studentModel {
	
	private int studId;
	private String studentName;
	private String city;
	
	public studentModel() {
		
	}

	public studentModel(int studId, String studentName, String city) {
		super();
		this.studId = studId;
		this.studentName = studentName;
		this.city = city;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "studentModel [studId=" + studId + ", studentName=" + studentName + ", city=" + city + "]";
	}
	
	}
