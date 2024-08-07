package JunitMockito.com.demo.Mock;

public class UserService {
	
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		if(user.getAddId()>100) {
			return;
		}
		this.userRepository.save(user);
	}

}
