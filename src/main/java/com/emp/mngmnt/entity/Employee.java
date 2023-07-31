package com.emp.mngmnt.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	
	@Column
	private String empname;
	@Column
	private  String empstate;
	@Column
	private  String designation;
	@Column
	private String mobileno;
	@Column
	private String salarygrade;
	@Id
	private String empcode;
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpstate() {
		return empstate;
	}
	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getSalarygrade() {
		return salarygrade;
	}
	public void setSalarygrade(String salarygrade) {
		this.salarygrade = salarygrade;
	}
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	

	
	
	
}
