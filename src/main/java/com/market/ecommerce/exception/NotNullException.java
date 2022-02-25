package com.market.ecommerce.exception;

public class NotNullException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	String message;

	public NotNullException(String message) {
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
		return "NotNullException [message=" + message + "]";
	}
	
	

}
