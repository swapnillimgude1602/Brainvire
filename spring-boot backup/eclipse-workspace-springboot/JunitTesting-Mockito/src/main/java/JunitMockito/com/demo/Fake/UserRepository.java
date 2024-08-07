package JunitMockito.com.demo.Fake;

import java.util.Collection;

public interface UserRepository {

	public void save(User user);
	Collection<User> findAll();
}
