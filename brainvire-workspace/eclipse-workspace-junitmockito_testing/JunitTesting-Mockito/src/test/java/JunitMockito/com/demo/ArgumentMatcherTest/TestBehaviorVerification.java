package JunitMockito.com.demo.ArgumentMatcherTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import JunitMockito.com.demo.ArgumentMatcher.User;
import JunitMockito.com.demo.ArgumentMatcher.UserRepository;
import JunitMockito.com.demo.ArgumentMatcher.UserService;

@ExtendWith(MockitoExtension.class)
public class TestBehaviorVerification {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;

	// if same salary
	@Test
	public void testUpdateSalary() {
		User user1 = new User(5, "swapnil", "pune", "123", 1000);
		User user2 = new User(5, "swapnil", "pune", "123", 400);

		// Type Argument Matchers
//		when(newRepo.findUserByUserId(5)).thenReturn(user1);
		when(userRepository.findUserByUserId(any(Integer.class))).thenReturn(user1);

		userService.updateSalary(5, 400);
		verify(userRepository).save(user2);
	}

	//TType argument matchers

//		@Test
//		public void invalidUseOfArgumentMatchers() {
//			User user1 = new User(5, "swapnil", "pune", "swapnil", 1000);
//			when(userRepository.findUserByUserNameAndUserPassword("swapnil", "swapnil")).thenReturn(user1);
//			when(userRepository.findUserByUserNameAndUserPassword(eq("swapnil"), any())).thenReturn(user1);
//			User actual = userService.getUserByUserNameAndUserPassword("swapnil", "swapnil");
//			System.out.println(actual.toString());
//			assertEquals("swapnil", actual.getUserName());
//	
//		}

	/*
	 * Argument Matcher cannot be used outside the stubbing/verification methods.
	 * Argument Matcher should be provided for all arguments
	 */

	//Specific type of argument matchers
	
	@Test
	public void specificTypeOfArgumentMatchers() {
		User user1 = new User(5, "swapnil", "pune", "swapnil", 1000);
		when(userRepository.findUserByUserNameAndUserPassword(anyString(), anyString(), anyBoolean()))
				.thenReturn(user1);
		User actual = userService.getUserByUserNameAndUserPasswordAndIsValid("swapnil", "swapnil", true);
		System.out.println(actual.toString());
		assertEquals("swapnil", actual.getUserName());

	}
	
	//Collection TYpe of Argument Matchers
	@Test
	public void collectionTypeOfArgumentMatchers() {
		User user = new User(5, "swapnil", "pune", "123", 1000);
		List<User> users = new ArrayList<User>();
		users.add(user);
		userService.addUsers(users);
		verify(userRepository).saveAll(anyList());
		//anySet(), anyMap()etc
	}
	
	//String TYpe of Argument Matchers
	@Test
	public void stirngTypeOfArgumentMatchers() {
		User user1 = new User(10, "swapnil", "pune", "swapnil", 1000);
//		when(userRepository.findUserByUserNameAndUserPassword(startsWith("swap"), anyString(), anyBoolean()))
//				.thenReturn(user1);
//		when(userRepository.findUserByUserNameAndUserPassword(contains("nil"), anyString(), anyBoolean()))
//		.thenReturn(user1);
		when(userRepository.findUserByUserNameAndUserPassword(startsWith("swap"), anyString(), anyBoolean()))
		.thenReturn(user1);
		User actual = userService.getUserByUserNameAndUserPasswordAndIsValid("swapnil", "swapnil", false);
		System.out.println(actual.toString());
		assertEquals("swapnil", actual.getUserName());

	}
	

}
