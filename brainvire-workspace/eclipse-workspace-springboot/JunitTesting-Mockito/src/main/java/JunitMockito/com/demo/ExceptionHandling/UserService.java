package JunitMockito.com.demo.ExceptionHandling;

import java.sql.SQLException;
import java.util.List;

public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public int findAllUsers() throws DatabaseReadException {
		List<User> allUser = null;
		try {
			allUser = userRepository.findAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// logged an exception
			throw new DatabaseReadException("Unable to read from database" + e.getMessage());
		}
		int totalSalary = 0;
		for (User user : allUser) {
			totalSalary = totalSalary + user.getUserPayment();
		}
		return totalSalary;
	}

	public void addUser(User user) throws DatabaseWriteException {
		try {
			userRepository.save(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// logged an exception
			throw new DatabaseWriteException("**Unable to write**" + e.getMessage());
		}
	}

}