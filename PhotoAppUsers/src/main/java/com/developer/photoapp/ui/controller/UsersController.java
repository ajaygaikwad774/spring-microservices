package com.developer.photoapp.ui.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.photoapp.ui.model.Users;
import com.developer.photoapp.ui.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UsersController {

	@Autowired
	private Environment env;
	
	@Autowired
	UserService userService;
	
	/*
	 * @Autowired BCryptPasswordEncoder bCryptPasswordEncoder;
	 */	
	
	@GetMapping(path = "/status")
	public String Status() {
		return "working on port"+env.getProperty("local.server.port");
	}  
	
	@PostMapping(path = "/createUser", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } )
	public ResponseEntity<Users>  createUser(@Valid @RequestBody Users user) {
		System.out.println("Creating Student...... " + user.getUserId());
		//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return  new ResponseEntity<Users>(userService.createUser(user),HttpStatus.ACCEPTED);
	}
}