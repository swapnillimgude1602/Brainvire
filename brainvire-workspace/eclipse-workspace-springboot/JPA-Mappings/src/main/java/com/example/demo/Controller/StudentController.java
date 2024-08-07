package com.example.demo.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@GetMapping("/getStuds")
	public List<Student> getStudent() {
		LOGGER.info("Inside get Student of Student Controller");
		return this.studentService.getAllStudent();
	}

	@GetMapping("/name/{name}")
	public Student getStudentByName(@RequestBody Student student, @PathVariable("name") String name) {
		Student studentName = this.studentService.getStudentByName(name);
		return studentName;

	}

	@PostMapping("/addStud")
	public Student addStudent(@Valid @RequestBody Student student) {
		Student stud = this.studentService.insertStudent(student);
		return stud;
	}

	@PutMapping("/updateStud/{studentId}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("studentId") int studentId) {
		Student stud = this.studentService.updateStudent(student, studentId);
		return stud;
	}

	@PutMapping("/{studId}/assign/{courseId}")
	public Student assignCourse(@PathVariable("studId") int studId, @PathVariable("courseId") int courseId) {
		return studentService.assignCourse(studId, courseId);
	}

	@DeleteMapping("/deleteStud/{studid}")
	public void deleteStudent(@PathVariable("studid") int studid) {
		this.studentService.deleteStudent(studid);
	}
}
