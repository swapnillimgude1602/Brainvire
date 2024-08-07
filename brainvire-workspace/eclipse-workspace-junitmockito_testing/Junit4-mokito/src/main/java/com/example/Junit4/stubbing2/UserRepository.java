package com.example.Junit4.stubbing2;

import java.util.List;

public interface UserRepository {

	List<User> findNewUsers(int days);
	public User findUserByUserId(int userId);
	public void save(User user);

}
