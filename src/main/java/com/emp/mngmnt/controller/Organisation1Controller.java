package com.emp.mngmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.mngmnt.entity.Organisation1;
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

}