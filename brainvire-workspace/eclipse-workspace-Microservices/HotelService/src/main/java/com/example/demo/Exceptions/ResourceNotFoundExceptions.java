package com.example.demo.Exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundExceptions extends RuntimeException {

	// by default exception if get called
	public ResourceNotFoundExceptions() {
		super("ResourceNotFound On Server");
	}

	public ResourceNotFoundExceptions(String message) {
		super(message);
	}
}
