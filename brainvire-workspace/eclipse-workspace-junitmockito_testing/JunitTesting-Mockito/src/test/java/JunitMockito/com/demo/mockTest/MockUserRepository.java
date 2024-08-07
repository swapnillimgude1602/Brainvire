package JunitMockito.com.demo.mockTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import JunitMockito.com.demo.Mock.User;
import JunitMockito.com.demo.Mock.UserRepository;

public class MockUserRepository implements UserRepository {

	int saveCalled = 0;
	User lastAddedUser = null;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		saveCalled++;
		lastAddedUser = user;
	}
	
	//BEHAVIOR VERIFICATION AT MOCK
	public void verify(User user, int times) {
		assertEquals(times, saveCalled);
		assertEquals(user, lastAddedUser);

	}
}
