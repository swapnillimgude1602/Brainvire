package JunitMockito.com.demo.ArgumentCaptor;

public interface UserRepository {
	
	public void save(User user);
	public User findUserByUserId(int userId);

}
