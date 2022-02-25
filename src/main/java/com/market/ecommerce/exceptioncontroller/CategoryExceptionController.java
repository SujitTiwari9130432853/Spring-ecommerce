package com.market.ecommerce.exceptioncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.market.ecommerce.exception.NotFoundException;
import com.market.ecommerce.exception.NotInStockException;
import com.market.ecommerce.exception.NotNullException;
import com.market.ecommerce.exception.RepeatException;

@ControllerAdvice
public class CategoryExceptionController {
	
	
	@ExceptionHandler(value=NotFoundException.class)
	public ResponseEntity<Object> exception(NotFoundException e){
		NotFoundException nfe=e;
		return new ResponseEntity<Object>(nfe, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=RepeatException.class)
	public ResponseEntity<Object> exception(RepeatException e){
		RepeatException re=e;
		return new ResponseEntity<Object>(re, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=NotNullException.class)
	public ResponseEntity<Object> exception(NotNullException e){
		NotNullException nne=e;
		return new ResponseEntity<Object>(nne, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=NotInStockException.class)
	public ResponseEntity<Object> exception(NotInStockException e){
		NotInStockException nis=e;
		return new ResponseEntity<Object>(nis, HttpStatus.BAD_REQUEST);
	}
}
