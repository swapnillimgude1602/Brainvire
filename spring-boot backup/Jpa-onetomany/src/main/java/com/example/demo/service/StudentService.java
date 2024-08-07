package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudent() {

		List<Student> getStudents = this.studentRepository.findAll();
		return getStudents;
	}

	public Student insertStudent(Student student) {
		Student insertStudent = this.studentRepository.save(student);
		return insertStudent;
	}

	public Student updateStudent(Student student, int studentId) {
		student.setStudentID(studentId);
		Student stud = this.studentRepository.save(student);
		return stud;
	}

}
