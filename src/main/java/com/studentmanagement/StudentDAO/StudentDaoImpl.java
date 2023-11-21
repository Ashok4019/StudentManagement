package com.studentmanagement.StudentDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.studentmanagement.API.Student;
import com.studentmanagement.StudentRowMapper.StudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	@Override
	public List<Student> loadstudent() {
	
		 String sql="select * from students";
		 List<Student> ListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		System.out.println(ListOfStudent);
		return ListOfStudent;
	}

}
