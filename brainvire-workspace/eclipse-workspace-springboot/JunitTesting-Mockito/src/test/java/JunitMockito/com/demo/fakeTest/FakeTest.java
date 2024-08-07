package JunitMockito.com.demo.fakeTest;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import JunitMockito.com.demo.Fake.User;
import JunitMockito.com.demo.Fake.UserRepository;
import JunitMockito.com.demo.Fake.UserService;
import junit.framework.TestCase;
public class FakeTest extends TestCase{
	
	// Fake Test Double
	@Test
	public 	void testFake() {
		UserRepository repository = new FakeUserRepository();
		UserService service = new UserService(repository);
		service.saveUser(new User(1,"Swapnil","Pune","1234"));
		service.saveUser(new User(2,"Devendra","Pune","12345"));
		assertEquals(2, service.findNumberOfUsers());
	}
	
	@Test
	public void testFakeWithMockito() {
		UserRepository userrepo = mock(UserRepository.class);
		UserService service = new UserService(userrepo);
		
		User user1 = new User(1,"Swapnil","Pune","1234");
		User user2 = new User(2,"Devendra","Pune","12345");
		
		Collection<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);
		
		when(userrepo.findAll()).thenReturn(user);
	
		assertEquals(2, service.findNumberOfUsers());
		
		
	}

}
