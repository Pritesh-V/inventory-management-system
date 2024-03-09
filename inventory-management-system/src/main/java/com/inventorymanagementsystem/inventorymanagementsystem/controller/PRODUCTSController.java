package com.inventorymanagementsystem.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventorymanagementsystem.inventorymanagementsystem.entity.PRODUCTS;
import com.inventorymanagementsystem.inventorymanagementsystem.repository.PRODUCTSRepository;

@RestController
public class PRODUCTSController {
        
	private PRODUCTSRepository productsrepository;

	public PRODUCTSController(PRODUCTSRepository productsrepository) {
		super();
		this.productsrepository = productsrepository;
	}
	
	
	@GetMapping("/all-products")
	public List<PRODUCTS> getAllProducts(){
		return productsrepository.findAll();
	}
	
	@PostMapping("/create-prodcut")
	public void createProduct(@RequestBody PRODUCTS product) {
		productsrepository.save(product);
	}
}
