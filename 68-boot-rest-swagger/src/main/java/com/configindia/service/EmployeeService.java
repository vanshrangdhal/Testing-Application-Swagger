package com.configindia.service;

import java.util.List;

import com.configindia.entity.Employee;

public interface EmployeeService {
Employee saveEmployee(Employee employee);
List<Employee> getAllEmployees();
Employee getEmployeeById(Integer id);
Employee updateEmployee(Employee employee,Integer id);
void deleteEmployee(Integer id);
}
