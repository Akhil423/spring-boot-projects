package com.spring.boot.restful.socialmediarestfulservices.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDAOService userService;
	
	//retrieveAllUsers
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
	return 	userService.findAll();
	}
	
	//retrieveOneUser
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		
		return userService.findone(id);
	}

}
