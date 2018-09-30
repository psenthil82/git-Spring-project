package com.senthil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senthil.data.Employee;
import com.senthil.repository.EmployeeRepository;

@RestController
public class EmployeeRestService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/allEmployee")
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}

}
