package com.example.demo.Service;

import com.example.demo.Exception.UserException;
import com.example.demo.Model.User;

public interface UserService {

	public User  findUserById(Long userId) throws UserException;
	public User  findUserProfileByJwt(String jwt) throws UserException;

}
