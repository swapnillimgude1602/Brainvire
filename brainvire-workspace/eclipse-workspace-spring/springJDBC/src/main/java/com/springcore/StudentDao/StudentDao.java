package com.springcore.StudentDao;

import java.util.List;

import com.springcore.Entity.studentModel;

public interface StudentDao {
	
	public int insert(studentModel studentmodel);
	public int update(studentModel studentmodel);
	public int delete(int studId);
	public studentModel getStudent(int studId);
	public List<studentModel> getAllStudents();
}