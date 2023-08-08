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

import com.emp.mngmnt.entity.Organisation1;
import com.emp.mngmnt.model.OrganisationModel;
import com.emp.mngmnt.service.Organisation1Service;

@RestController
@RequestMapping("/organisation1")
public class Organisation1Controller {
	
	@Autowired
	private    Organisation1Service organisation1Service;
	
	@PostMapping("/save")
	public ResponseEntity<Organisation1> saveOrganisation1( @RequestBody Organisation1 organisation1){
		Organisation1 organisation13=organisation1Service.saveOrganisation1(organisation1);
		return new ResponseEntity<Organisation1>(organisation13,  HttpStatus.CREATED);
	
	}
	@GetMapping("/getbyid/{id}")//getbyid/E03
	public ResponseEntity<Organisation1> getById(@PathVariable String id){
		Organisation1 organisation13=organisation1Service.getById(id);
		return new ResponseEntity<Organisation1>(organisation13,  HttpStatus.OK);
	
	}
	@PutMapping("/update")
	public ResponseEntity<Organisation1> updateByOrgid(@RequestBody OrganisationModel OrganisationModel){
		Organisation1 organisation13=organisation1Service.updateByOrgid(OrganisationModel);
		return new ResponseEntity<Organisation1>(organisation13,HttpStatus.OK);
	
	}
	@DeleteMapping("/delete/{orgid}")
	public ResponseEntity<String> deleteByOrgid(@PathVariable String orgid){
		String response=organisation1Service.deleteByOrgid(orgid);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	
	}
}
