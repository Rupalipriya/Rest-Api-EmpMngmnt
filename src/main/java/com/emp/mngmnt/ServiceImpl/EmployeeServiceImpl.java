package com.emp.mngmnt.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.emp.mngmnt.Repository.EmployeeRepo;
import com.emp.mngmnt.entity.Employee;
import com.emp.mngmnt.model.EmployeeModel;
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

	@Override
	public Employee getById(String id) {
	Optional<Employee> optional=employeeRepo.findById(id);
	Employee employee= optional.get();
		return employee;
	}

	@Override
	public Employee updateByEmpcode(EmployeeModel employeeModel) {
		Optional<Employee> optional=employeeRepo.findById(employeeModel.getEmpcode());
		Employee employee=optional.get();
		employee.setDesignation(employeeModel.getDesignation());
		employee.setMobileno(employeeModel.getMobileno());
		Employee employee2=  employeeRepo.save(employee);
		return employee2;
	}

}
