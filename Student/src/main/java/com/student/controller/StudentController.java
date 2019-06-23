package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.bean.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	
	StudentService service = StudentService.getInstance();
	
	
	@RequestMapping(value="/hello")
	public String hello()
	{
		service.setStudent();
		return "Hello";
	}
	
	@RequestMapping(value="/list")
	public List<Student> display()
	{
		return service.getList();
		
	}
	
	@RequestMapping(value="/ ", method=RequestMethod.POST)
	public String UpdateStudent(@RequestBody Student student)
	{
		if(service.UpdateStudent(student))
		return "Student Record successfully udpated. UpdatedStudent Name: " + student.getName();
		
		return "Student with rollNumber " +student.getRegisterNumber()+" doesnt exist";
		
	}
	
}
