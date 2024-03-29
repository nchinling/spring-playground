package com.ncl.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ncl.employeeservice.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
