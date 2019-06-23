package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.text.IsEqualIgnoringCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.bean.Student;

@Service
public class StudentService {
	@Autowired
	Student student1;
	
	private List<Student> studentList;
	private static StudentService service=null;
	private StudentService()
	{
		studentList = new ArrayList<Student>();
	}                                   
	public void setStudent()
	{
		student1.setName("Mani");
		student1.setAge(28);
		student1.setRegisterNumber("A101");
		studentList.add(student1);
	}
	public static StudentService getInstance()
	{
			if (service ==null)
				return new StudentService();
			else return service;
	}
	
	public List<Student> getList()
	{
		
		return studentList;
	}
	public boolean UpdateStudent(Student student)
	{
		for (int i=0;i<studentList.size();i++)
		{
			if (student.getRegisterNumber().equalsIgnoreCase(studentList.get(i).getRegisterNumber()))
			{
			studentList.set(i, student)	;
			return true;
			}
		}
		return false;
	}
}
