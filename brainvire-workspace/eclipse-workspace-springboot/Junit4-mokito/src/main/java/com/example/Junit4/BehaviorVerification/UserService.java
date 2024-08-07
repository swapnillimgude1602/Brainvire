package com.example.Junit4.BehaviorVerification;

public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void addUser(User user) {
		userRepository.save(user); // mockito applies equals here
	}

	public void addUser(UserRequest userrequest) {
		System.out.println(userrequest.toString());
		if (userrequest.getUserPayment() > 500) {
			User user = new User();
			user.setUserName(userrequest.getUserName());
			user.setUserAddress(userrequest.getUserAddress());
			user.setUserPassword(userrequest.getUserPassword());
			System.out.println(userrequest.getUserPayment());
			user.setUserPayment(userrequest.getUserPayment());
			System.out.println(user.toString());
			userRepository.save(user); // mockito applies equals here
		} else {
			return;
		}
	}

	public void updateSalary(int userId, int updatedSalary) {
		if (userId == 0) {
			return;
		}
		User user = userRepository.findUserByUserId(userId);
//		if(user.getUserPayment()==updatedSalary) {
//			return;
//		}
		user.setUserPayment(updatedSalary);
		userRepository.save(user);
	}

}
