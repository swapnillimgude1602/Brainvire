package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;

@Service
public class studentService {

	public static List<Student> students = new ArrayList<>();
	static {
		students.add(new Student(1, "Swapnil", "Mumbai", "8308154098"));
		students.add(new Student(2, "Narendra", "Pune", "8888811181"));
		students.add(new Student(3, "Madhuri", "Mumbai", "1111919919"));
	}

	// get all student
	public List<Student> getAllStudents() {

		return students;
	}

	// get single student
	public Student getStudentById(int id) {

		// java8 stream api
		Student stud = null;
		stud = students.stream().filter(e -> e.getStudentId() == id).findFirst().get();
		return stud;
	}

	//adding Student
	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}
}
