package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Student_Table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_Id")
	private int studentID;

	@NotBlank
	private String studentName;

	@NotBlank
	private int studentAge;

	@NotBlank
	@Email(message = "**Email is not valid**")
	private String studentEmail;

	@NotBlank(message = "**Please add PhoneNumber**")
	@Size(min = 6, max = 10, message = "**Phone number must contain only 10 digits**")
	private String studentPhoneNo;

	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Department department;

	@OneToMany(mappedBy = "student", cascade = CascadeType.MERGE)
	private List<Address> address;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_Id")
	private List<Courses> courses;

	public Student() {

	}

	public Student(int studentID, String studentName, int studentAge, String studentEmail,  String studentPhoneNo, Department department,
			List<Address> address, List<Courses> courses) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentEmail=studentEmail;
		this.studentPhoneNo = studentPhoneNo;
		this.department = department;
		this.address = address;
		this.courses = courses;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) {
		this.studentEmail=studentEmail;
	}

	public String getStudentPhoneNo() {
		return studentPhoneNo;
	}

	public void setStudentPhoneNo(String studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentEmail=" + studentEmail + ", studentPhoneNo=" + studentPhoneNo + ", department=" + department
				+ ", address=" + address + ", courses=" + courses + "]";
	}

	
}
