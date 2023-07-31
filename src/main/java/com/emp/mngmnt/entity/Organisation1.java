package com.emp.mngmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="organisation1")
public class Organisation1 {
	 @Id
	private String orgid;
	 @Column
	private String orgname;
	 @Column
	private String location;
	 @Column
	private String totalnoofemployee;
	 @Column
	private String orgemail;
	public String getOrgid() {
		return orgid;
	}
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTotalnoofemployee() {
		return totalnoofemployee;
	}
	public void setTotalnoofemployee(String totalnoofemployee) {
		this.totalnoofemployee = totalnoofemployee;
	}
	public String getOrgemail() {
		return orgemail;
	}
	public void setOrgemail(String orgemail) {
		this.orgemail = orgemail;
	}
	 
	

}
