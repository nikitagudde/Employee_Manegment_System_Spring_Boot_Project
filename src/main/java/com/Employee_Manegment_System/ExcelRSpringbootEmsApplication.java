package com.Employee_Manegment_System;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import com.Employee_Manegment_System.repo.EmployeeRepository;
	@SpringBootApplication
	public class ExcelRSpringbootEmsApplication {
	public static void main(String[] args) {
	SpringApplication.run(ExcelRSpringbootEmsApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	}

