package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Courses;
import com.example.demo.Repository.CoursesRepository;

@Service
public class CoursesService {

	@Autowired
	private CoursesRepository coursesRepository;

	public Courses insertCourse(Courses course) {
		System.out.println("--course is--" + course.toString());

		Courses addCourse = this.coursesRepository.save(course);
		System.out.println("--Course Inserted--" + addCourse.toString());
		return addCourse;

	}

	public List<Courses> getCourses() {
		List<Courses> getCourse = this.coursesRepository.findAll();
		return getCourse;
	}

	public void deleteAddress(int addressid) {
		this.coursesRepository.deleteById(addressid);
		System.out.println("--Course Deleted--");
	}

	public Courses updateCourse(Courses courses, int courseid) {
		courses.setCourseId(courseid);
		Courses update = this.coursesRepository.save(courses);
		System.out.println("--Course Updated--");
		return update;
	}
}
