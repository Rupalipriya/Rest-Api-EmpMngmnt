package com.emp.mngmnt.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.mngmnt.Repository.Organisation1Repo;
import com.emp.mngmnt.entity.Organisation1;
import com.emp.mngmnt.model.OrganisationModel;
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

	@Override
	public Organisation1 getById(String id) {
		Optional<Organisation1> optional=organisation1Repo.findById(id);
		Organisation1 organisation13=optional.get();
		return organisation13;
	}

	@Override
	public Organisation1 updateByOrgid(OrganisationModel organisationModel) {
		Optional<Organisation1> optional=organisation1Repo.findById(organisationModel.getOrgid());
		Organisation1 organisation13=optional.get();
		organisation13.setOrgid(organisationModel.getOrgid());
		organisation13.setLocation(organisationModel.getLocation());
		organisation13.setOrgemail(organisationModel.getOrgemail());
		Organisation1 Organisation12=organisation1Repo.save(organisation13);
		return Organisation12;
	}

	@Override
	public String deleteByOrgid(String orgid) {
		organisation1Repo.deleteById(orgid);
		return "success:"+orgid +" deleted";
	}

}
