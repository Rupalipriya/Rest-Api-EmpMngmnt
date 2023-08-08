package com.emp.mngmnt.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.mngmnt.Repository.ClientRepo;
import com.emp.mngmnt.entity.Client;
import com.emp.mngmnt.model.ClientModel;
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

	@Override
	public Client getById(String id) {
	Optional<Client> optional=clientRepo.findById(id);
	Client client1=optional.get();
		return client1;
	}

	@Override
	public Client updateByClientid(ClientModel clientModel) {
		Optional<Client> optional=clientRepo.findById(clientModel.getClientid());
		Client client1=optional.get();
		client1.setMobno(clientModel.getMobno());
		client1.setEmail(clientModel.getEmail());
		Client client2=clientRepo.save(client1);
			return client2;
		
	}

	@Override
	public String deleteByClientid(String clientid) {
		clientRepo.deleteById(clientid);
		return "Success: "+clientid +" Deleted";
	}

}
