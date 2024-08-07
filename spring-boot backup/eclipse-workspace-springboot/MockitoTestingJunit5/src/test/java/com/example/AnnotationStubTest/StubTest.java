package com.example.AnnotationStubTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.AnnotationsStub.User;
import com.example.AnnotationsStub.UserRepository;
import com.example.AnnotationsStub.UserService;

public class StubTest{

	@Test
	public void stubTestWithMockito() {
		UserRepository newRepo = mock(UserRepository.class);
		UserService newService = new UserService(newRepo);
		
		User user1 = new User(1, "Swapnil","Pune", "swap123", 1000);
		User user2 = new User(2, "Madhuri","Pune", "madh123", 2000);
		
		List<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);
		
		when(newRepo.findNewUsers(5)).thenReturn(user);
		
		List<User> UserswithnewPayment = newService.getUserWithNewPayment(500, 5);
		
		assertEquals(2,UserswithnewPayment.size());
		assertEquals(1500, UserswithnewPayment.get(0).getUserPayment());
		assertEquals(2500, UserswithnewPayment.get(1).getUserPayment());

	}

}
