package JunitMockito.com.demo.BDD_BehaviorVerification;

public interface UserRepository {
	
	public void save(User user);
	public User findUserByUserId(int userId);

}
