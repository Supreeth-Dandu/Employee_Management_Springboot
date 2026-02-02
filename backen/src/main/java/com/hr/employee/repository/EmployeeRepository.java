package com.hr.employee.repository;

import com.hr.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No need to write any code — JpaRepository gives CRUD for free!
}
