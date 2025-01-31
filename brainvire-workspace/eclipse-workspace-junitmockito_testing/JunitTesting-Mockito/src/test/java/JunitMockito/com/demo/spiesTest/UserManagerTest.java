package JunitMockito.com.demo.spiesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import JunitMockito.com.demo.Spies.User;
import JunitMockito.com.demo.Spies.UserManager;
import JunitMockito.com.demo.Spies.UserService;

@ExtendWith(MockitoExtension.class)
public class UserManagerTest {
	
	@InjectMocks
	private UserManager usermanager;
	
	@Spy
	private UserService userService;
	
	@Test
	public void testMockitoSpy() {
		
		//we need to mock findUser method because it is communicating to db or method not implemented
		//we also need to call getIncrementedSalary to calculate incremented salary
		User user = new User(121, "Swapnil", "Pune", "123", 5000);
		//while performing mockinf in spy must use doreturn
		doReturn(user).when(userService).findUser(121);	//passing the actual id //Stubbing mock
		int newSalary = usermanager.incrementSalary(121, 1000);
		assertEquals(6000, newSalary)	;
	}

}
