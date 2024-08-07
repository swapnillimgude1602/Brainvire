package JunitMockito.com.demo.BDD_BehaviorVerification;

public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void updateSalary(int userId, int updatedSalary) {
		User user = userRepository.findUserByUserId(userId);
		user.setUserPayment(updatedSalary);
		userRepository.save(user);
	}

}
