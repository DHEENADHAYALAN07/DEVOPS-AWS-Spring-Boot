package com.devops.employee_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devops.employee_api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}