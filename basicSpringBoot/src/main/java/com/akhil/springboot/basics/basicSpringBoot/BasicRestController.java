package com.akhil.springboot.basics.basicSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		return Arrays.asList(new Book(1l,"demo book", "varma"));
	}

}
