package com.springcore.ReferenceType;

public class Marks {
	
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Marks(int marks) {
		super();
		this.marks = marks;
	}
	
	public Marks() {
		
	}

	@Override
	public String toString() {
		return "Marks [marks=" + marks + "]";
	}
	
	

}
