package com.inventorymanagementsystem.inventorymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventorymanagementsystem.inventorymanagementsystem.entity.ADMIN;
import com.inventorymanagementsystem.inventorymanagementsystem.entity.PRODUCTS;

public interface PRODUCTSRepository  extends JpaRepository<PRODUCTS,Integer> {

	 
}
