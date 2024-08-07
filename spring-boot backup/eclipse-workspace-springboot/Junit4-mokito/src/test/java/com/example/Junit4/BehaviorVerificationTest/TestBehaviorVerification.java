package com.example.Junit4.BehaviorVerificationTest;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.Junit4.BehaviorVerification.User;
import com.example.Junit4.BehaviorVerification.UserRepository;
import com.example.Junit4.BehaviorVerification.UserService;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
public class TestBehaviorVerification {

	@InjectMocks
	private UserService newService;

	@Mock
	private UserRepository newRepo;

	@Test
	public void testAddUser() {

		User userAdd = new User(1, "Swap", "Pune", "pass", 1000);
		this.newService.addUser(userAdd);
		verify(newRepo).save(userAdd);
	}

	
	
	
/*	
	@Test
	public void testUserWithHigerSalary0() {
		UserRequest userreq = new UserRequest("swapnil", "pune", "123", 400);
		User user = new User(2, "swapnil", "pune", "123", 400);
		newService.addUser(userreq);
		newService.addUser(userreq);
		verify(newRepo, times(0)).save(user);
	}

	@Test
	public void testUserWithHigerSalary1() {
		UserRequest userreq = new UserRequest("swapnill", "punee", "1234", 1000);
		User user = new User(2, "swapnill", "punee", "1234", 1000);
		newService.addUser(userreq);
		verify(newRepo, times(1)).save(user);
	}

	@Test
	public void testUserWithHigerSalary2() {
		try {
			UserRequest userreq = new UserRequest("swapnil", "pune", "123", 700);
			User user = new User(2, "swapnil", "pune", "123", 700);
			newService.addUser(userreq);
			// verify(newRepo,times(1)).save(user);
			verify(newRepo).save(user);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void testUserWithHigerSalary3() {
		UserRequest userreq = new UserRequest("swapnil", "pune", "123", 400);
		User user = new User(2, "swapnil", "pune", "123", 400);
		newService.addUser(userreq);
		verify(newRepo, never()).save(user);
	}

	// to change
	@Test
	public void testUpdateSalary() {
		newService.updateSalary(2, 1000);
		verifyNoInteractions(newRepo);
	}

	// if same salary
	@Test
	public void testUpdateSalary2() {
		User user = new User(5, "swapnil", "pune", "123", 400);
		when(newRepo.findUserByUserId(5)).thenReturn(user);
		newService.updateSalary(5, 400);
		verify(newRepo).findUserByUserId(5);
		verify(newRepo).save(user);
		verifyNoMoreInteractions(newRepo);
	}

	@Test
	public void testUpdateSalary3() {
		User user = new User(5, "swapnil", "pune", "123", 400);
		when(newRepo.findUserByUserId(5)).thenReturn(user);
		newService.updateSalary(5, 400);

		InOrder inOrder = Mockito.inOrder(newRepo);
		inOrder.verify(newRepo).save(user);
		inOrder.verify(newRepo).findUserByUserId(5);
//		inOrder.verify(newRepo).save(user);
	}

	@Test
	public void testUserWithHigerSalary4() {
		UserRequest userreq = new UserRequest("swapnil", "pune", "123", 400);
		User user = new User(2, "swapnil", "pune", "123", 400);
		newService.addUser(userreq);
		newService.addUser(userreq);
//	verify(newRepo, times(0)).save(user);
		verify(newRepo, atLeast(0)).save(user);
	}
*/
}