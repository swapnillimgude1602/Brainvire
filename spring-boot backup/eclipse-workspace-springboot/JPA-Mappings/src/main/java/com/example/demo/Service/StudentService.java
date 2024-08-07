package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Courses;
import com.example.demo.Model.Student;
import com.example.demo.Repository.CoursesRepository;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CoursesRepository coursesRepository;

	public List<Student> getAllStudent() {

		List<Student> getStudents = this.studentRepository.findAll();
		return getStudents;
	}

	public Student insertStudent(Student student) {
		Student insertStudent = this.studentRepository.save(student);
		System.out.println("--Student Inserted--");
		return insertStudent;
	}

	public Student updateStudent(Student student, int studentId) {
		student.setStudentID(studentId);
		Student stud = this.studentRepository.save(student);
		System.out.println("--Student Updated--");
		return stud;
	}

	public Student assignCourse(int studentId, int coursesId) {
		List<Courses> courseset = null;
		Student student = studentRepository.findById(studentId).get();
		Courses course = coursesRepository.findById(coursesId).get();

		courseset = student.getCourses();
		courseset.add(course);
		student.setCourses(courseset);
		System.out.println("--Course Assigned--");
		return studentRepository.save(student);
	}

	public void deleteStudent(int studentid) {
		this.studentRepository.deleteById(studentid);
		System.out.println("--Student Deleted--");
	}

	public Student getStudentByName(String name) {
		return studentRepository.findByStudentName(name);
	}
}
