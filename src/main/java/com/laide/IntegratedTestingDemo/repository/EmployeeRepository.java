package com.laide.IntegratedTestingDemo.repository;

import com.laide.IntegratedTestingDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
