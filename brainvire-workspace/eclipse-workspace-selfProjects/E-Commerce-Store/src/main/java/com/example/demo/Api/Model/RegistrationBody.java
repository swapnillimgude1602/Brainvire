package com.example.demo.Api.Model;

import lombok.Data;

@Data
public class RegistrationBody {

	private String username;
	private String email;
	private String password;
	private String firstname;
	private String lastname;

}
