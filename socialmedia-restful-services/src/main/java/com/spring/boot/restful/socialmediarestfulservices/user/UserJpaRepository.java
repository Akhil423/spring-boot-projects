package com.spring.boot.restful.socialmediarestfulservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Integer> {
	
	
}
