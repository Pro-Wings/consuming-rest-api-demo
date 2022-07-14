package com.pro.wings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pro.wings.model.Employee;
import com.pro.wings.service.EmpService;

@RestController
public class EmpMgmtApiRestClient {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id)
	{
		return empService.getEmployee(id);
	}

}
