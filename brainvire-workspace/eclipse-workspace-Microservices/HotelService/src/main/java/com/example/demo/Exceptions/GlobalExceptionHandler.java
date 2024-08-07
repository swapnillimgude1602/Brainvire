package com.example.demo.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Centralized Exception Handler
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundExceptions.class) // whereever ResourceNotFoundExceptions class is user down
														// method will be called
	public ResponseEntity<Map<String, Object>> notFoundHandler(ResourceNotFoundExceptions exception) {
		Map map = new HashMap();
		map.put("message", exception.getMessage());
		map.put("Success", false);
		map.put("Status", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

	}

}
