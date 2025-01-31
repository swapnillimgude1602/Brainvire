package JunitMockito.com.demo.BDD_StubbingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.BDDMockito.given;
import JunitMockito.com.demo.BDD_Stubbing.User;
import JunitMockito.com.demo.BDD_Stubbing.UserRepository;
import JunitMockito.com.demo.BDD_Stubbing.UserService;

import static org.assertj.core.api.BDDAssertions.then;

@ExtendWith(MockitoExtension.class)
public class StubTest {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;

	@Test
	public void testStubbingTraditionalMockitoStyle() {

		User user1 = new User(1, "Swapnil", "Pune", "swap123", 1000);
		User user2 = new User(2, "Madhuri", "Pune", "madh123", 2000);

		List<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);

		when(userRepository.findNewUsers(5)).thenReturn(user);

		List<User> UserswithnewPayment = userService.getUserWithNewPayment(500, 5);

		assertEquals(2, UserswithnewPayment.size());
		assertEquals(1500, UserswithnewPayment.get(0).getUserPayment());
		assertEquals(2500, UserswithnewPayment.get(1).getUserPayment());

	}

	@Test
	@DisplayName("test_given_newUser_when_testBDDStyleStubbing_ISCalled_then_new user with incremented salary is returned")
	public void testStubbingTraditionalBDDStyle() {

		// Arrange-Given
		User user1 = new User(1, "Swapnil", "Pune", "swap123", 1000);
		User user2 = new User(2, "Madhuri", "Pune", "madh123", 2000);

		List<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);

		given(userRepository.findNewUsers(5)).willReturn(user);

		// Act-when
		List<User> UserswithnewPayment = userService.getUserWithNewPayment(500, 5);

		// Assert-verify/assert
		//tradititonal style
//		assertEquals(2, UserswithnewPayment.size());
//		assertEquals(1500, UserswithnewPayment.get(0).getUserPayment());
//		assertEquals(2500, UserswithnewPayment.get(1).getUserPayment());

		
		//BDD AssertJ -- BDDAssertions
		then(UserswithnewPayment).isNotNull();
		then(UserswithnewPayment.size()).isEqualTo(2);
		then(UserswithnewPayment.get(0).getUserPayment()).isEqualTo(1500);
		then(UserswithnewPayment.get(1).getUserPayment()).isEqualTo(2500);

	}
}
