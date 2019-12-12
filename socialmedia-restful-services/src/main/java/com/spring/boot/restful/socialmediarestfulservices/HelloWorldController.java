package com.spring.boot.restful.socialmediarestfulservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller

@RestController
public class HelloWorldController {

		//GET
		//URI - /hello-world
		//method - print hellow world
	
		@GetMapping("/hello-world")
		public String printHello() {
			
			
			return "Hello World";
		}
		
		@GetMapping("/hello-world-bean")
		public HelloBean printHelloBean() {
			
			
			return new HelloBean("Hello World");
		}
}
