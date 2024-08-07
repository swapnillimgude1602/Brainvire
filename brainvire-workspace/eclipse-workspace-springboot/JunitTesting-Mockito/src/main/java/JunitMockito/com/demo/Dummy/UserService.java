package JunitMockito.com.demo.Dummy;

public class UserService {

	private UserRepository userRepository;
	private EmailService emailService;

	public UserService(UserRepository userRepository, EmailService emailService) {
		super();
		this.userRepository = userRepository;
		this.emailService = emailService;
	}

	public void saveUser(User user) {
		this.userRepository.save(user);
	}

	public int findNumberOfUsers() {
		return this.userRepository.findAll().size();

	}
}
