package com.studentmanagement.StudentRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import com.studentmanagement.API.Student;

public class StudentRowMapper implements RowMapper<Student> {

	/*
	 * @Autowired private Student student;
	 */

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	System.out.println(rs.getInt("id"));
	System.out.println(rs.getString("name"));	
	Student student=new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setMobile(rs.getLong("mobile"));
		student.setCountry(rs.getString("country"));
		
		return student;
		
	}

}
