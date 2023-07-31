package com.emp.mngmnt.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.mngmnt.Repository.Organisation1Repo;
import com.emp.mngmnt.entity.Organisation1;
import com.emp.mngmnt.service.Organisation1Service;


@Service
public class Organisation1ServiceImpl implements Organisation1Service {
	@Autowired
	private Organisation1Repo organisation1Repo;

	@Override
	public Organisation1 saveOrganisation1(Organisation1 organisation1) {
		Organisation1 Organisation12=organisation1Repo.save(organisation1);
		return Organisation12;
	}

}
