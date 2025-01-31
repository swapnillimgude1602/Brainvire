package com.example.Junit4.stubbing2;

import static org.mockito.Mockito.doNothing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


//@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class StubbingTest2 {

	@InjectMocks
	private UserService newService;

	@Mock
	private UserRepository newRepo;

	@Test
	public void testSaveUser() {
		User user2 = new User(0, "swapnil", "pune", "123", 2000);
		doNothing().when(newRepo).save(user2); // donothing this method is used to stub out void methods
		newService.addUser(user2);
	}

	@Test
	public void testSaveUserWithUserRequest() {
		UserRequest userreq = new UserRequest("swapnil", "pune", "123", 2000);
// 2 books gets created with diff obj in this class and in user service class  so overide equals method in user class

		User user = new User(0, "swapnil", "pune", "123", 2000);
		doNothing().when(newRepo).save(user);
		// donothing this method is used to stub out void methods

		newService.addUser(userreq);
	}
	
	@Test
	public void testUserWithHigerSalary() {
		UserRequest userreq = new UserRequest("swapnil", "pune", "123", 5000);
		User user = new User(0, "swapnil", "pune", "123", 5000);
		newService.addUserr(userreq);
	}
}
