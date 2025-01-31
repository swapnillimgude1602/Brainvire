package com.user.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.service.payload.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<APIResponse> handlerResourceNotFoundException(UserNotFoundException userNotFoundException) {
		String message = userNotFoundException.getMessage();
		APIResponse response = APIResponse.builder().isSuccess(false).status(HttpStatus.NOT_FOUND).message(message)
				.build();
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
}