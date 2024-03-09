package com.inventorymanagementsystem.inventorymanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InventoryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
         
	@Bean 
	public WebMvcConfigurer corsConfigur() {
		return new WebMvcConfigurer() {
			public  void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				        .allowedMethods("*")
				        .allowedOrigins("http://localhost:3000/");
			}
		};
	}
}
