package JunitMockito.com.demo.ArgumentMatcher;

import java.util.List;

public interface UserRepository {

	public void save(User user);

	public User findUserByUserId(int userId);

	public User findUserByUserNameAndUserPassword(String userName, String userPassword);

	public User findUserByUserNameAndUserPassword(String userName, String userPassword, boolean isValid);

	public void saveAll(List<User> user);
}
