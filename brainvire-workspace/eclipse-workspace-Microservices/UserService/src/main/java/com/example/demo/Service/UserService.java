package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entiy.UserEntity;

public interface UserService {

	UserEntity saveUser(UserEntity userEntity);
	List<UserEntity> getAllUsers();
	UserEntity getUser(String userId);
	UserEntity getbyUserName(String userName);
	UserEntity updateUser(UserEntity userEntity, String userId);
	void deleteUser(String userId);

}
