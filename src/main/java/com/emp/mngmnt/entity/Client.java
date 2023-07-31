package com.emp.mngmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Client {
@Id
	private  String clientid;
	@Column
	private String clientname;
	@Column
	private String clocation;
	@Column
	private Integer mobno;
	@Column
	private String email;
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClocation() {
		return clocation;
}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	public Integer getMobno() {
		return mobno;
	}
	public void setMobno(Integer mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
