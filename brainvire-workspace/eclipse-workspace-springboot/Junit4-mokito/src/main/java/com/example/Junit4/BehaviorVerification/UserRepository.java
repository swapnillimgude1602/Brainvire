package com.example.Junit4.BehaviorVerification;

public interface UserRepository {
	
	public void save(User user);
	public User findUserByUserId(int userId);

}
