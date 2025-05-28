package com.configindia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.configindia.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
