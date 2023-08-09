package com.emp.mngmnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.mngmnt.entity.Client;

public interface ClientRepo extends JpaRepository<Client, String> {
	
	

}
