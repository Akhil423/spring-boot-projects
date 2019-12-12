package com.akhil.springboot.basics.jpaproject.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhil.springboot.basics.jpaproject.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
