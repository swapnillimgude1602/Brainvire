package com.rating.exeception;

public class RatingNotFoundException extends RuntimeException {
	public RatingNotFoundException() {
		super();
	}
	
	public RatingNotFoundException(String message) {
		super(message);
	}
}
