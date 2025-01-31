package JunitMockito.com.demo.ArgumentCaptorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import JunitMockito.com.demo.ArgumentCaptor.User;
import JunitMockito.com.demo.ArgumentCaptor.UserRepository;
import JunitMockito.com.demo.ArgumentCaptor.UserRequest;
import JunitMockito.com.demo.ArgumentCaptor.UserService;

@ExtendWith(MockitoExtension.class)
public class testArgumentCaptor {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;
	
	@Captor
	private ArgumentCaptor<User> argumentCaptor;

	
	@Test
	public void testAddUser() {
		UserRequest UserRequest = new UserRequest("Swapnil", "Pune", "123", 5000);
		//User user = new User(121, "Swapnil", "Pune", "123", 5000);
		
		//Argument captor instance
//		ArgumentCaptor<User> argumentCaptor = ArgumentCaptor.forClass(User.class);		///use annotation @Captor
		userService.addUser(UserRequest);
		verify(userRepository).save(argumentCaptor.capture());
		User user = argumentCaptor.getValue();		//gets value
//		System.out.println(user.toString());
		assertEquals("Swapnil", user.getUserName());
		
		
	}
}
