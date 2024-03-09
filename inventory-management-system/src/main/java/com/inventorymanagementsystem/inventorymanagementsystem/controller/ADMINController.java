package com.inventorymanagementsystem.inventorymanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventorymanagementsystem.inventorymanagementsystem.entity.ADMIN;
import com.inventorymanagementsystem.inventorymanagementsystem.repository.ADMINRepository;

@RestController
public class ADMINController {

	private ADMINRepository repository;

	public ADMINController(ADMINRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	@GetMapping("/admin")
	public List<ADMIN> retrivealladminbyid(){
		return repository.findAll();
		
	}
}
