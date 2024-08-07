package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Centralized Exception Handler
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundExceptions.class) // whereever ResourceNotFoundExceptions class is user down
														// method will be called
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundExceptions exception) {
		String message = exception.getMessage();
		ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND)
				.build();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);

	}

}
