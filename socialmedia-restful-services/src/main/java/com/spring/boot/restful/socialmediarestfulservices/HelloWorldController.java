package com.spring.boot.restful.socialmediarestfulservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		

		@GetMapping("/hello-world-bean/pathvariable/{name}")
		public HelloBean printHelloPathVariable(@PathVariable String name ) {
			
			
			return new HelloBean(String.format("Hello World %s", name));
		}
}
