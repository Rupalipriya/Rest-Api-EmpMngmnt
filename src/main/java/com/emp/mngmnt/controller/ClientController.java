package com.emp.mngmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.mngmnt.entity.Client;
import com.emp.mngmnt.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	

	@Autowired
	 private ClientService  clientService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Client> saveClient(@RequestBody Client client){
		Client client2=	clientService.saveClient( client);
		return  new ResponseEntity<Client>(client2,HttpStatus.CREATED);
		
	}
	@GetMapping("/getbyid/{id}")//getbyid/c03
	public ResponseEntity<Client> getById(@PathVariable String id){
		Client client2=	clientService.getById( id);
		return  new ResponseEntity<Client>(client2,HttpStatus.OK);
	}
}
