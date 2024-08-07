package com.springcore.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.Entity.studentModel;

@Component("studentDao")
public class StudentDaoImple implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Insert logic
	@Override
	public int insert(studentModel studentmodel) {
		// TODO INSERTING DATA
        String insertquery="insert into student(studId,name,city) values(?,?,?)";
        int res = this.jdbcTemplate.update(insertquery,studentmodel.getStudId(),studentmodel.getStudentName(),studentmodel.getCity());
		return res;
	}
	
	//update logic
	@Override
	public int update(studentModel studentmodel) {
		// TODO UPDATING DATA
		String updatequery = "update student set name=? , city=? where studId=?";
        int res = this.jdbcTemplate.update(updatequery,studentmodel.getStudentName(),studentmodel.getCity(),studentmodel.getStudId());
		return res;
	}
	
	//delete Logic
	@Override
	public int delete(int studId) {
		// TODO DELETING DATA
		String deletequery = "delete from student where studId=?";
		 int res = this.jdbcTemplate.update(deletequery,studId);
		return res;
	}

	//fetch data logic
	@Override
	public studentModel getStudent(int studId) {
		// TODO fetching data from database
		String query = "select * from student where studId=?";
		RowMapper<studentModel> rowMapper = new rowMapperImple();		//rowmapper interface so to make implementation class
		studentModel student = this.jdbcTemplate.queryForObject(query, rowMapper,studId);
		return student;
	}

	//fetching all students from db
	@Override
	public List<studentModel> getAllStudents() {
		// TODO fetching all data
		String query = "select * from student";
		List<studentModel> students = this.jdbcTemplate.query(query, new rowMapperImple());
		return students;
	}

}
