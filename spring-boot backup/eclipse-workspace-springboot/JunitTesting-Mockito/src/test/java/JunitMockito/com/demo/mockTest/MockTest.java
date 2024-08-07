package JunitMockito.com.demo.mockTest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import JunitMockito.com.demo.Mock.User;
import JunitMockito.com.demo.Mock.UserService;

public class MockTest {

	@Test
	public void mockTest() {
		MockUserRepository repository = new MockUserRepository();
		UserService service = new UserService(repository);
		User user1 = new User(1, 200, "Swapnil", "Pune", "swap123");
		User user2 = new User(2, 50, "Madhuri", "Pune", "madh123");

		service.saveUser(user1);
		service.saveUser(user2);

		repository.verify(user2, 1);

	}

	@Test
	public void mockTestWithMockito() {
		MockUserRepository repository = Mockito.mock(MockUserRepository.class); // creates fake mock repository
		UserService service = new UserService(repository);
		 
		User user1 = new User(1, 200, "Swapnil", "Pune", "swap123");
		User user2 = new User(2, 50, "Madhuri", "Pune", "madh123");

		service.saveUser(user1);//returns no save will be called
		service.saveUser(user2);//save is called

		Mockito.verify(repository, Mockito.times(0)).save(user1); //fail interaction only made once.
		Mockito.verify(repository, Mockito.times(1)).save(user2); //success


	}
}
