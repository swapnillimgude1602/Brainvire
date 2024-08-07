package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getStuds")
	public List<Student> getStudent() {
		return this.studentService.getAllStudent();
	}

	@PostMapping("/addStud")
	public Student addStudent(@RequestBody Student student) {
		Student stud = this.studentService.insertStudent(student);
		return stud;
	}

	@PutMapping("/updateStud/{studentId}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("studentId") int studentId) {
		Student stud = this.studentService.updateStudent(student, studentId);
		return stud;
	}
}
