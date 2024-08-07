package com.springcore.constructor_Injection;

public class Person {

	private int studentId;
	private String studentName;
	
	public Person(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Person [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
}
