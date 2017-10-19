package com.gestao.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		
		builder
			.inMemoryAuthentication()
			.withUser("rodolfo").password("123").roles("USER")
			.and()
			.withUser("vicente").password("123").roles("USER");
			
	}

}
