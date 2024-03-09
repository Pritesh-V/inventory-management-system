package com.inventorymanagementsystem.inventorymanagementsystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.*;

@Configuration
public class SpringSecurityConfiguration {
         
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception {
		// all requests should be authenticated
		http.authorizeHttpRequests(
				auth ->auth.anyRequest().authenticated());
		// if a request is not authenticated , a web page is shown
		http.httpBasic(withDefaults());
		// CSRF -> Post,Put
		http.csrf().disable();
	    return http.build();	
	}
}
