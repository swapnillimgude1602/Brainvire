package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department_Table")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_Id")
	private int departmentId;
	private String departmentName;
	private String departmentFloor;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "student_Id")
	@JsonBackReference
	private Student student;

	public Department() {

	}
	

	public Department(int departmentId, String departmentName, String departmentFloor, Student student) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentFloor = departmentFloor;
		this.student = student;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentFloor() {
		return departmentFloor;
	}

	public void setDepartmentFloor(String departmentFloor) {
		this.departmentFloor = departmentFloor;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
