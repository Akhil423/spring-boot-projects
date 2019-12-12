package com.spring.boot.restful.socialmediarestfulservices.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.spring.boot.restful.socialmediarestfulservices.user.UserNotFoundException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends 
	ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> 
		handleAllException(Exception ex, WebRequest request) {

			ExceptionResponse eresponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
	
			return new ResponseEntity(eresponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> 
		handleUserNotFoundException(Exception ex, WebRequest request) {

			ExceptionResponse eresponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
	
			return new ResponseEntity(eresponse, HttpStatus.NOT_FOUND);
	}
		
}
