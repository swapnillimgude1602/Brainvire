package JunitMockito.com.demo.Spies;

public class UserManager {
	
	private UserService userService;

	public UserManager(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public int incrementSalary(int userId, int salaryHike) {
		User user = userService.findUser(userId);
		int incrementedSalary = userService.getIncrementedSalary(user, salaryHike);
		return incrementedSalary;
	}																										
	
	

}
										