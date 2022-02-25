package com.market.ecommerce.exception;

public class InvalidException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;

	public InvalidException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidException [message=" + message + "]";
	}

	
	
	

}
