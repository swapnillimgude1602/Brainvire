package com.example.demo.Dto;

import com.example.demo.enums.UserRole;

import lombok.Data;

@Data
public class UserDto {

	private Long id;
	private String name;
	private String email;
	private String password;
	private UserRole userRole;
}
