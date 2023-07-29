package com.emp.mngmnt.service;

import com.emp.mngmnt.entity.Employee;

public interface EmployeeService {
	
 Employee saveEmployee(Employee employee);
Employee  getById(String id);

}
