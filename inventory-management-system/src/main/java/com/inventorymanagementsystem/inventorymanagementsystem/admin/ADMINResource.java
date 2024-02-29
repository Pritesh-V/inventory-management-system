package com.inventorymanagementsystem.inventorymanagementsystem.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ADMINResource {

	private ADMINRepository repository;

	public ADMINResource(ADMINRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	@GetMapping("/admin")
	public List<ADMIN> retrivealladminbyid(){
		return repository.findAll();
		
	}
}
