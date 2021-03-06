package com.mobile.app.ws.ui.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.app.ws.ui.model.User;
import com.mobile.app.ws.ui.model.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {

	Map<String, User> users;
	
	@GetMapping(path = "/{userId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<User>  getUser(@PathVariable String userId) {
		
		if (users.containsKey(userId)) {
			System.out.println(userId);
			return new ResponseEntity<User>(users.get(userId),HttpStatus.ACCEPTED);
		}else {
			System.out.println(userId+ " not found");
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		
	}
	
	//@RequestParam(value = "page") int page, @RequestParam(value = "limit", defaultValue = "1") int limit, @RequestParam(value = "sort", defaultValue = "asc", required = false) String sort
	@GetMapping  
	public Map<String, User> getUsers() {
		return users;
	}
	
	@PostMapping( consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public User createUser(@RequestBody UserResponse userResponse) {
		User userRequest = new User();
		userRequest.setName(userResponse.getName());
		userRequest.setEmail(userResponse.getEmail());
		
		String userId = UUID.randomUUID().toString();
		userRequest.setUserId(userId);
		
		if (users == null) {
			users = new HashMap<String, User>();
			users.put(userId, userRequest);
		}else {
			users.put(userId, userRequest);
		}
		
		return userRequest;
	}
	
	@PutMapping(path = "/{userId}" , consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } )
	public User updateUser(@PathVariable String userId,@RequestBody UserResponse user) {
		User usr = users.get(userId);
		usr.setName(user.getName());
		usr.setEmail(user.getEmail());
		
		users.put(userId, usr);
		
		return usr;
		
	}
	
	@DeleteMapping
	public void deleteUser(@PathVariable String userId) {
		users.remove(userId);
	}
	
}
