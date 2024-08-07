package JunitMockito.com.demo.Spies;

public class UserService {

	public User findUser(int userId) {
		// TODO Auto-generated method stub
		// method not implemented
		// mockit
		throw new RuntimeException("Method not implemented");
	}

	public int getIncrementedSalary(User user, int salaryHike) {
		// TODO Auto-generated method stub
		int incrementedSalary = 0;
		int salary = user.getUserPayment();
		incrementedSalary = salary + salaryHike;
		return incrementedSalary;
	}

}
