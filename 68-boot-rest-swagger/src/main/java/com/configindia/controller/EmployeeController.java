package com.configindia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configindia.entity.Employee;
import com.configindia.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
@Autowired
private EmployeeServiceImpl serviceImpl;

public EmployeeController(EmployeeServiceImpl serviceImpl) {
	super();
	this.serviceImpl = serviceImpl;
}
@PostMapping
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	return new ResponseEntity<Employee>(serviceImpl.saveEmployee(employee),HttpStatus.CREATED);
}
@GetMapping
public List<Employee> getAllEmployees(){
	return serviceImpl.getAllEmployees();
}
@GetMapping("{id}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id){
	return new ResponseEntity<Employee>(serviceImpl.getEmployeeById(id),HttpStatus.OK);
}
@PutMapping("{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable("id")Integer id,@RequestBody Employee employee){
	return new ResponseEntity<Employee>(serviceImpl.updateEmployee(employee, id),HttpStatus.OK);
}
@DeleteMapping("{id}")
public ResponseEntity<String>  deleteEmployee(@PathVariable("id")Integer id){
	serviceImpl.deleteEmployee(id);
	return new ResponseEntity<String>("Employee deleted successfully...!",HttpStatus.OK);
}
}
