package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.Employee;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/save")
	public void saveEmp(@RequestBody Employee e) {
		service.saveEmp(e);
		System.out.println("Data stored");
	}
	
	@GetMapping("/readAll")
	public List<Employee> readAll(){
		return service.readEmp();
	}
	
	@GetMapping("/findById")
	public Employee findById(@RequestParam int id) {
		return service.findEmpById(id);
	}
	
	@PutMapping("/updateEmp")
	public Employee updateEmployee(@RequestParam int id,@RequestBody Employee emp) {
		return service.updateEmp(id, emp);
	}
	
	@DeleteMapping("/deleteEmp")
	public Employee deleteEmp(@RequestParam int id) {
		return service.deleteEmp(id);
	}
	

}
