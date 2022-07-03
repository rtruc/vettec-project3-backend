package com.skilstorm.project3.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://www.ubno.com"})
@RequestMapping("/authenticate")
public class AuthenticateController {

	
	
	
}
