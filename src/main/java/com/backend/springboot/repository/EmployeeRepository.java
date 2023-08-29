package com.backend.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
