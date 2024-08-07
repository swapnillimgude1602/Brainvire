package com.example.demo.Service.Auth;

import com.example.demo.Dto.SignupRequest;
import com.example.demo.Dto.UserDto;

public interface AuthService {

	UserDto createCustomer(SignupRequest signuprequest);
	boolean hasCustomerWtihEmail(String email);
}
