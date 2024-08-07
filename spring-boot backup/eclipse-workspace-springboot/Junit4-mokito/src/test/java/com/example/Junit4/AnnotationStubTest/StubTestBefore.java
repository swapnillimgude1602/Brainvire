package com.example.Junit4.AnnotationStubTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.Junit4.AnnotationStub.User;
import com.example.Junit4.AnnotationStub.UserRepository;
import com.example.Junit4.AnnotationStub.UserService;

public class StubTestBefore {
	@InjectMocks
	private UserService newService;

	@Mock
	private UserRepository newRepo;
	
	@Before
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	public void stubTestWithMockito() {
//		UserRepository newRepo = mock(UserRepository.class); //Replaced with annotation mock
//		UserService newService = new UserService(newRepo);  //Replaced with annotation injectmock

		User user1 = new User(1, "Swapnil", "Pune", "swap123", 1000);
		User user2 = new User(2, "Madhuri", "Pune", "madh123", 2000);

		List<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);

		when(newRepo.findNewUsers(5)).thenReturn(user);

		List<User> UserswithnewPayment = newService.getUserWithNewPayment(500, 5);

		assertEquals(2, UserswithnewPayment.size());
		assertEquals(1500, UserswithnewPayment.get(0).getUserPayment());
		assertEquals(2500, UserswithnewPayment.get(1).getUserPayment());

	}

}
