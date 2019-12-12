package com.akhil.springboot.basics.jpaproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akhil.springboot.basics.jpaproject.entity.User;
import com.akhil.springboot.basics.jpaproject.service.UserDAOService;
import com.akhil.springboot.basics.jpaproject.service.UserRepository;

@Component
public class RepositoryServiceCommandLineRunner implements CommandLineRunner {
	
	
	private static final Logger log = 
				LoggerFactory.getLogger(RepositoryServiceCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Varma","Admin");
		
		User userObj = userRepository.save(user);
		
		log.info("New user created with id:"+ userObj);
	}

}
