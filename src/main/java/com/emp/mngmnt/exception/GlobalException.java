package com.emp.mngmnt.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	//Method to handle No value present 
	@ExceptionHandler(NoSuchElementException.class)
	ResponseEntity<String>  handleException(NoSuchElementException ex){
		return new ResponseEntity<String> ("No value present in DB, Change Your Request",HttpStatus.NOT_FOUND);
	}
	
	//Method to hadle Null values
	@ExceptionHandler(NullPointerException.class)
ResponseEntity<String>	handleNullExcption(NullPointerException ex){
		return new ResponseEntity<String> ("Value Is Null, Please check",HttpStatus.BAD_REQUEST);

	}
	

}
