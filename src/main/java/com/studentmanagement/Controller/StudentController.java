package com.studentmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentmanagement.API.Student;
import com.studentmanagement.API.StudentDTO;
import com.studentmanagement.StudentDAO.StudentDao;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	@GetMapping("/student")
	public String getstudents(Model model) {
		List<Student> studentlist = studentDao.loadstudent();
		
		for(Student student:studentlist) {
			System.out.println(student);
		}
		model.addAttribute("studentlist", studentlist);	
		return "Select-Studentlist";
		
		
	}
	
	@GetMapping("/addstudent")
	public String addstudents(Model model) {

		StudentDTO studentDTO=new StudentDTO();
		
		model.addAttribute("student", studentDTO);
		return "addstudent";
		
		
	}

}
