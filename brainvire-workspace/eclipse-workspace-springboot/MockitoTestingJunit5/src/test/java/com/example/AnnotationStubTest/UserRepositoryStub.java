package com.example.AnnotationStubTest;

import java.util.ArrayList;
import java.util.List;

import com.example.AnnotationsStub.User;
import com.example.AnnotationsStub.UserRepository;

public class UserRepositoryStub implements UserRepository {

	@Override
	public List<User> findNewUsers(int days) {
		// TODO Auto-generated method stub
		List<User> newUsers = new ArrayList<User>();
		User user1 = new User(1, "Swapnil","Pune", "swap123", 1000);
		User user2 = new User(2, "Madhuri","Pune", "madh123", 2000);
		newUsers.add(user1);
		newUsers.add(user2);
		return newUsers;
	}

}
