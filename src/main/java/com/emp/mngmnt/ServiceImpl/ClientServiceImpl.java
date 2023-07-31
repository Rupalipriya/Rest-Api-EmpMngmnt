package com.emp.mngmnt.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.mngmnt.Repository.ClientRepo;
import com.emp.mngmnt.entity.Client;
import com.emp.mngmnt.service.ClientService;


@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	 private ClientRepo clientRepo;

	@Override
	public Client saveClient(Client client) {
		Client client1=clientRepo.save(client);
		return client1;
	}

}
