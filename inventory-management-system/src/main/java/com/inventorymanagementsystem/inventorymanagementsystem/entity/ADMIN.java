package com.inventorymanagementsystem.inventorymanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ADMIN {
	
	@Id
	@GeneratedValue
	private Integer ADMIN_id;
	
	@Column
	private String ADMIN_name;
	@Column
	private String ADMIN_email;
	@Column
	private String ADMIN_password;
	@Column
	private LocalDate createdAt;
	@Column
	private LocalDate UpdatedAt;
	@Column
	private LocalDate lastLogin;
	
	
	
	
	
	// constructor
	
	
	public ADMIN() {
		
	}
	
	public ADMIN(Integer aDMIN_id, String aDMIN_name, String aDMIN_email, String aDMIN_password,
			LocalDate createdAt,LocalDate updatedAt, LocalDate lastLogin) {
		super();
		ADMIN_id = aDMIN_id;
		ADMIN_name = aDMIN_name;
		ADMIN_email = aDMIN_email;
		ADMIN_password = aDMIN_password;
		this.createdAt = createdAt;
		UpdatedAt = updatedAt;
		this.lastLogin = lastLogin;
	}
	
	
	// Getters and setters
	
	public Integer getADMIN_id() {
		return ADMIN_id;
	}
	public void setADMIN_id(Integer aDMIN_id) {
		ADMIN_id = aDMIN_id;
	}
	public String getADMIN_name() {
		return ADMIN_name;
	}
	public void setADMIN_name(String aDMIN_name) {
		ADMIN_name = aDMIN_name;
	}
	public String getADMIN_email() {
		return ADMIN_email;
	}
	public void setADMIN_email(String aDMIN_email) {
		ADMIN_email = aDMIN_email;
	}
	public String getADMIN_password() {
		return ADMIN_password;
	}
	public void setADMIN_password(String aDMIN_password) {
		ADMIN_password = aDMIN_password;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(LocalDate updatedAt) {
		UpdatedAt = updatedAt;
	}
	public LocalDate getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDate lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	
	// to string method 
	
	@Override
	public String toString() {
		return "ADMIN [ADMIN_id=" + ADMIN_id + ", ADMIN_name=" + ADMIN_name + ", ADMIN_email=" + ADMIN_email
				+ ", ADMIN_password=" + ADMIN_password + ", createdAt=" + createdAt + ", UpdatedAt=" + UpdatedAt
				+ ", lastLogin=" + lastLogin + "]";
	}
	
	
	
	
	
	
	
	

}
