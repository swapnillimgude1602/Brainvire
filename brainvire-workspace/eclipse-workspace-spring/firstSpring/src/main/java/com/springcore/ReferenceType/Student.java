package com.springcore.ReferenceType;

public class Student {
	
	private String name;
	private Marks marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public Student(String name, Marks marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
