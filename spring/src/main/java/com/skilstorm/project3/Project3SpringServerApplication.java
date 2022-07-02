package com.skilstorm.project3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Project3SpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project3SpringServerApplication.class, args);
	}

}
