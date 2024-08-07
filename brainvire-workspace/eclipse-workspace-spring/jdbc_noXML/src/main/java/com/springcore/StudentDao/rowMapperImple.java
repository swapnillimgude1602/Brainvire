package com.springcore.StudentDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.Entity.studentModel;

public class rowMapperImple implements RowMapper<studentModel> {

	@Override
	public studentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		studentModel student = new studentModel();
		student.setStudId(rs.getInt(1));
		student.setStudentName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
	