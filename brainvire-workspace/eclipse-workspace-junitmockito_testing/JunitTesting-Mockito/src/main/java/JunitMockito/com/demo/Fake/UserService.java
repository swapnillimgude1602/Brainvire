package JunitMockito.com.demo.Fake;

public class UserService {
	
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		this.userRepository.save(user);
	}

	public int findNumberOfUsers() {
		return this.userRepository.findAll().size();
		
		
	}
}
