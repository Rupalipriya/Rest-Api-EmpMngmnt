package com.emp.mngmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.mngmnt.entity.Employee;
import com.emp.mngmnt.model.EmployeeModel;
import com.emp.mngmnt.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
@Autowired
private EmployeeService employeeService;
	
	@PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
	Employee employee2=	employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(employee2,HttpStatus.CREATED);
    	
    }
	
	@GetMapping("/getbyid/{id}")//getbyid/E03
  public ResponseEntity<Employee>	getById(@PathVariable String id){
	Employee employee=	employeeService.getById(id);
	return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	
@PutMapping("/update")
public ResponseEntity<Employee> updateByEmpcode(@RequestBody EmployeeModel employeeModel) {
	Employee employee=  employeeService.updateByEmpcode(employeeModel);
	return new ResponseEntity<Employee>(employee,HttpStatus.OK);
 }

@DeleteMapping("delete/{empcode}")
 public ResponseEntity<String> deleteByEmpCode(@PathVariable String empcode){
String response=employeeService.deleteByEmpcode(empcode);
return new ResponseEntity<String>(response,HttpStatus.OK);
  }

	
}
