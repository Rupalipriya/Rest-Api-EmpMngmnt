package com.emp.mngmnt.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.emp.mngmnt.Repository.EmployeeRepo;
import com.emp.mngmnt.entity.Employee;
import com.emp.mngmnt.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
	Employee employee2=	employeeRepo.save(employee);
		return employee2;
	}

}
