package com.emp.mngmnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.mngmnt.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>{

}
