package com.senthil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.senthil.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootProjectApplication extends SpringBootServletInitializer {
	
	@Autowired
	EmployeeRepository dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootApplication.class);
	}

	/*@Override
	public void run(String... args) throws Exception {
		
		System.out.println(dao.findById(1).getEmployeeName());
	}*/
	
	
}
