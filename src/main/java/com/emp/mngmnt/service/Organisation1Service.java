package com.emp.mngmnt.service;

import com.emp.mngmnt.entity.Organisation1;
import com.emp.mngmnt.model.OrganisationModel;

public interface Organisation1Service {
	
	Organisation1 saveOrganisation1(Organisation1 organisation1);
	Organisation1 getById(String id);
	Organisation1  updateByOrgid(OrganisationModel organisationModel);
	String  deleteByOrgid(String orgid);//success

}
