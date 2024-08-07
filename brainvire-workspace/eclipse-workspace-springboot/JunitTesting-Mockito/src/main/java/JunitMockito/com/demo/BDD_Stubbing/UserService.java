package JunitMockito.com.demo.BDD_Stubbing;

import java.util.List;

public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public List<User> getUserWithNewPayment(int newPayment, int days) {
		List<User> newUsers = this.userRepository.findNewUsers(days);

		for (User user : newUsers) {
			int payment = user.getUserPayment();
			int reniewPayment = payment + newPayment;
			user.setUserPayment(reniewPayment);
		}
		return newUsers;
	}
}
