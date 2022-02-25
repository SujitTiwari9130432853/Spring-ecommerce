package com.market.ecommerce.exceptioncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.market.ecommerce.exception.NotFoundException;

@ControllerAdvice
public class ProductExceptionController {
	
	@ExceptionHandler (value=NotFoundException.class)
	public ResponseEntity<Object> exception(NotFoundException e){
		NotFoundException nfe=e;
		return new ResponseEntity<Object>(nfe,HttpStatus.BAD_REQUEST);
	}

}
