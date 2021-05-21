package com.surittec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.surittec.entity.Clients;
import com.surittec.repositories.ClientsRepository;

@Controller
@RequestMapping("api/clients")
public class ClientsController {
	
	@Autowired
	private ClientsRepository clientsRepository;
	
	@GetMapping
	public List<Clients> getClients (){
		return clientsRepository.findAll();
	}
	
	@PostMapping
	public Clients addClients(@RequestBody Clients clients) {
		
		return clientsRepository.save(clients);
	}
	

}
