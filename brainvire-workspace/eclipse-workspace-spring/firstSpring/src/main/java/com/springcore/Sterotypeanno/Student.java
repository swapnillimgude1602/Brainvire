package com.springcore.Sterotypeanno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("object")
public class Student {
	
	@Value("Swapnil")
	private String studentName;
	
	@Value("Pune")
	private String address;
	
	@Value("#{address}")
	private List<String> add;
	
	//Spel Expression tags with static and var
	
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double squareRoot;
	
	@Value("#{ 8>3 }")
	private boolean isActive;
	
	
	//======================================//
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public List<String> getAdd() {
		return add;
	}
	public void setAdd(List<String> add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", address=" + address + ", add=" + add + ", squareRoot="
				+ squareRoot + ", isActive=" + isActive + "]";
	}
	
	
	
	}
	
