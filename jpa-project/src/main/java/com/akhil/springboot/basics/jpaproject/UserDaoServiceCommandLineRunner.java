package com.akhil.springboot.basics.jpaproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akhil.springboot.basics.jpaproject.entity.User;
import com.akhil.springboot.basics.jpaproject.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	
	
	private static final Logger log = 
				LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Akhil","Admin");
		
		long userId = userDAOService.insert(user);
		
		log.info("New user created with id:"+ userId);
	}

}
