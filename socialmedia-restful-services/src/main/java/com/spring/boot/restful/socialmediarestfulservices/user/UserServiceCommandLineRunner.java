package com.spring.boot.restful.socialmediarestfulservices.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private UserDAOService userService;

	@Override
	public void run(String... args) throws Exception {
	
		User user = new User("Aruna",new Date());
		User user1 = new User("Babu",new Date());
		User user2 = new User("Aravind",new Date());
		
		userService.save(user);
		userService.save(user1);
		userService.save(user2);
		
		
	}

}
