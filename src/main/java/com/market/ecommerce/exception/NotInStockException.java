package com.market.ecommerce.exception;

public class NotInStockException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	String message;

	public NotInStockException(String message) {
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
		return "NotInStockException [message=" + message + "]";
	}
	
	
}
