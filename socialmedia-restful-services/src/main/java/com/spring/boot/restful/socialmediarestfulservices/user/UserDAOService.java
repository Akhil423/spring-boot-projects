package com.spring.boot.restful.socialmediarestfulservices.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOService {
	
	@Autowired
	private UserJpaRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
	}
	
	public User save(User user) {
		
		return repository.save(user);
	}
	
	public Optional<User> findone(int id) {
		
		return repository.findById(id);
	}
	
}
