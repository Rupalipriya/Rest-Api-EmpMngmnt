package com.emp.mngmnt.service;

import com.emp.mngmnt.entity.Employee;
import com.emp.mngmnt.model.EmployeeModel;

public interface EmployeeService {
	
 Employee saveEmployee(Employee employee);
Employee  getById(String id);
Employee  updateByEmpcode(EmployeeModel employeeModel);
 String   deleteByEmpcode(String empcode);//"Success"

}
