package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.studentService;

@RestController
public class studentController {

	@Autowired
	private studentService studService;

	@GetMapping("/getStud")
	public List<Student> getStudents() {

		return this.studService.getAllStudents();
	}

	@GetMapping("/getStud/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return this.studService.getStudentById(id);
	}
	
	@PostMapping("/addStud")
	public Student addStudent(@RequestBody Student student) {
		Student stud = this.studService.addStudent(student);
		return stud;
	}
}
