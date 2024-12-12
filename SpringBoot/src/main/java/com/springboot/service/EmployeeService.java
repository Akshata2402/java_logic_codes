package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.Employee;
import com.springboot.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	

	public void saveEmp(Employee e) {
		repo.save(e);
	}
	
	public List<Employee> readEmp() {
		return repo.findAll();
	}
	
	public Employee findEmpById(int id) {
		Optional<Employee> e=repo.findById(id);
		
		if(e.isPresent()) {
			return e.get();
		}else {
			return null;
		}
	}
	
	public Employee updateEmp(int id,Employee emp) {
		
		Optional<Employee> e=repo.findById(id);
		
		if(e.isPresent()) {
		    emp.setId(id);
			repo.save(emp);
			return emp;
			
		}else {
			return null;
		}
		
		
	}
	
	public Employee deleteEmp(int id) {
		
		Optional e=repo.findById(id);
			if(e.isPresent()) {
				repo.deleteById(id);
				return (Employee) e.get();
			}else {
				return null;
			}
		}
	}

