package com.emp.mngmnt.service;

import com.emp.mngmnt.entity.Client;
import com.emp.mngmnt.model.ClientModel;

public interface ClientService {
	
	Client saveClient(Client client);
	Client getById(String id);
	Client updateByClientid(ClientModel clientModel);
	String deleteByClientid(String  clientid);
}
