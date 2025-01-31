package com.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotel.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<ApiResponse> setHotelNotFoundException(HotelNotFoundException e) {
		ApiResponse apiResponse = ApiResponse.builder().message(e.getMessage()).isValid(false)
				.httpStatus(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
}
