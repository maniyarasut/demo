package com.student.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.student.bean","com.student.controller","com.student.service"})
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StudentMain.class, args);

	}

}
