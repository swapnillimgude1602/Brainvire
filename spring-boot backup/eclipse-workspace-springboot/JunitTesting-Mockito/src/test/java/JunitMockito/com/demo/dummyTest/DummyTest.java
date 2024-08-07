package JunitMockito.com.demo.dummyTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import JunitMockito.com.demo.Dummy.EmailService;
import JunitMockito.com.demo.Dummy.User;
import JunitMockito.com.demo.Dummy.UserRepository;
import JunitMockito.com.demo.Dummy.UserService;

public class DummyTest {

	@Test
	public void dummyTest() {
		UserRepository repository = new DummyUserRepository();
		EmailService emailservice = new DummyEmailService();
		UserService service = new UserService(repository, emailservice);
		service.saveUser(new User(1, "Swapnil", "Pune", "1234"));
		service.saveUser(new User(2, "Devendra", "Pune", "12345"));
		assertEquals(2, service.findNumberOfUsers());
	}

	@Test
	public void dummyTestWithMockito() {
		UserRepository userrepo = mock(UserRepository.class);
		EmailService emailService = mock(EmailService.class);
		UserService service = new UserService(userrepo, emailService);

		User user1 = new User(1, "Swapnil", "Pune", "1234");
		User user2 = new User(2, "Devendra", "Pune", "12345");

		Collection<User> user = new ArrayList<>();
		user.add(user1);
		user.add(user2);

		when(userrepo.findAll()).thenReturn(user);

		assertEquals(2, service.findNumberOfUsers());

	}
}
