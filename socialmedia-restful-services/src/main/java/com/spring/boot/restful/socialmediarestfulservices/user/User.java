package com.spring.boot.restful.socialmediarestfulservices.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;
	
	@Past(message="date should always be past")
	private Date birthDate;
	
	protected User() {
		
	}

	public User(String name, Date birthDate) {
		super();
		
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	

}
