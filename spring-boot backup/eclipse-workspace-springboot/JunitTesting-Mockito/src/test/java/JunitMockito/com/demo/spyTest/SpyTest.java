package JunitMockito.com.demo.spyTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import JunitMockito.com.demo.Spy.User;
import JunitMockito.com.demo.Spy.UserService;

public class SpyTest {
	
	@Test
	public void spyTest() {
		SpyUserRepository repository = new SpyUserRepository();
		UserService service = new UserService(repository);
		User user1 = new User(1,"swap123","Swapnil","Pune", 50);
		User user2 = new User(2,"madh123", "Madhuri","Pune", 100);
		service.saveUser(user1);
		service.saveUser(user2);
		
		assertEquals(2,repository.timesCalled());
		assertTrue(repository.calledWith(user2));

	}
	
	@Test
	public void spyTestWithMockito() {
		SpyUserRepository repository =spy(SpyUserRepository.class); 
		//spy is created on actual object
		UserService service = new UserService(repository);
		 
		User user1 = new User(1, "swap123", "Swapnil", "Pune", 200);
		User user2 = new User(2, "madh123", "Madhuri", "Pune", 50);

		service.saveUser(user1);//returns no save will be called
		service.saveUser(user2);//save is called

		verify(repository, Mockito.times(0)).save(user1); //fail interaction only made once.
		verify(repository, Mockito.times(1)).save(user2); //success


	}

}
