package com.example.demo.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Courses_Table")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_Id")
	private int courseId;
	
	private String courseName;
	
	@JsonBackReference
	@ManyToMany(mappedBy = "courses")
	private List<Student> student;

	public Courses() {

	}

	public Courses(int courseId, String courseName, List<Student> student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.student = student;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
}
