package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.access.User;



@RestController
public class UserController {
	@Autowired
	private MongoTemplate monogoTemplate;
	
	
	@RequestMapping("/getUser")
	public String addUser() {
		User u = new User();
		u.setId(123);
		u.setPassword("lplplp");
		u.setUsername("Evan");
		monogoTemplate.save(u);
		return "sucess";
	}
}
