package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String empId;
	private String empName;
	
	@Autowired
	@Qualifier("address")
	private Address address;
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Set autowired");
		this.address = address;
	}
	
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Set autowired constructor");

	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	

}
