package JunitMockito.com.demo.AnnotationStubTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import JunitMockito.com.demo.Stub.User;
import JunitMockito.com.demo.Stub.UserRepository;
import JunitMockito.com.demo.Stub.UserService;

@ExtendWith(MockitoExtension.class)
public class StubTest{
	
	@InjectMocks
	private UserService newService;
	
	@Mock
	private UserRepository newRepo;

	@Test
	public void stubTestWithMockito() {
//		UserRepository newRepo = mock(UserRepository.class); //Replaced with annotation mock
//		UserService newService = new UserService(newRepo);  //Replaced with annotation injectmock
		
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
