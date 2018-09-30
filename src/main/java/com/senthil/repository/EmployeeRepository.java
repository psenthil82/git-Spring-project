package com.senthil.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.senthil.data.Employee;

@Repository
public class EmployeeRepository
{
	@PersistenceContext
	EntityManager entityManager;
	
	public Employee findById(long id)
	{
		return entityManager.find(Employee.class, id);
	}
	
	public List<Employee> findAll()
	{
		TypedQuery<Employee> queryResult = entityManager.createNamedQuery("findAll", Employee.class);
		return queryResult.getResultList();
	}

}
