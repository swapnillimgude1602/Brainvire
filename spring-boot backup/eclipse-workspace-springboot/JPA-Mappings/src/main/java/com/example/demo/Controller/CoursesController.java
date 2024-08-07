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

import com.example.demo.Model.Courses;
import com.example.demo.Service.CoursesService;

@RestController
@RequestMapping("/Courses")
public class CoursesController {

	Logger log = LoggerFactory.getLogger(CoursesController.class);
	
	@Autowired
	private CoursesService coursesService;

	@PostMapping("/addCourses")
	public Courses addCourse(@RequestBody Courses course) {
		log.info("*** addCourse : " + course.toString());
		Courses addCourse = this.coursesService.insertCourse(course);
		return addCourse;
	}

	@GetMapping("/getCourses")
	public List<Courses> getCourses() {
		List<Courses> getAllCourses = this.coursesService.getCourses();
		return getAllCourses;

	}

	@PutMapping("/updateCourse/{courseid}")
	public Courses updateCourse(@RequestBody Courses course, @PathVariable("courseid") int courseid) {
		Courses update = this.coursesService.updateCourse(course, courseid);
		return update;
	}

	@DeleteMapping("/deleteCourse/{deleteid}")
	public void deleteCourse(@PathVariable("deleteid") int deleteid) {
		this.coursesService.deleteAddress(deleteid);
	}
}
