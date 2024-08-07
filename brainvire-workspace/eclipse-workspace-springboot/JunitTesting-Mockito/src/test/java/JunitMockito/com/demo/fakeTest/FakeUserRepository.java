package JunitMockito.com.demo.fakeTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import JunitMockito.com.demo.Fake.User;
import JunitMockito.com.demo.Fake.UserRepository;

public class FakeUserRepository implements UserRepository {

	// fake data for testing can use inmemory db or any collection

	Map<Integer, User> userobj = new HashMap<>();

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userobj.put(user.getUserId(), user);

	}

	@Override
	public Collection<User> findAll() {
		// TODO Auto-generated method stub
		return userobj.values();
	}

}
