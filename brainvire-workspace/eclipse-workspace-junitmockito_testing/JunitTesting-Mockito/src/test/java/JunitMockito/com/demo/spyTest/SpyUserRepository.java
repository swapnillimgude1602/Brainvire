package JunitMockito.com.demo.spyTest;

import JunitMockito.com.demo.Spy.User;
import JunitMockito.com.demo.Spy.UserRepository;

public class SpyUserRepository implements UserRepository {

	int saveCalled = 0;
	User lastAddedUser = null;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		saveCalled++;
		lastAddedUser = user;
	}

	public int timesCalled() {
		return saveCalled;
	}

	public boolean calledWith(User user) {
		return lastAddedUser.equals(user);
	}
}
