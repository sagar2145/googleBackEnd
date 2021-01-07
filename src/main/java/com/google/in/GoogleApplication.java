package com.google.in;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "com.google.in")
@EnableJpaRepositories
@SpringBootApplication
public class GoogleApplication extends SpringBootServletInitializer {

	

//	
	
	public static void main(String[] args) {
		SpringApplication.run(GoogleApplication.class, args);
	}

}
