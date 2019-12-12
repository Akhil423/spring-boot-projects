package com.spring.boot.restful.socialmediarestfulservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ServletRequestDataBinderFactory;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		
		Optional<User> user = userService.findone(id);
		
		if(user.isEmpty())
			throw new UserNotFoundException("id - "+ id + " not found");
		
		return user;
	}
	
	//createUser
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user){
		
		User createdUser = userService.save(user);
		
		URI loc  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdUser.getId()).toUri();
	
		return ResponseEntity.created(loc).build();
	}
	
	//DeleteOneUser
		@DeleteMapping("/users/{id}")
		public void deleteUserById(@PathVariable int id) {
			
			try {
			 userService.deleteone(id);
			 }
			catch(Exception ex) {
			
				throw new UserNotFoundException("id - "+ id + " not found");
			}
			
		}
		

}
