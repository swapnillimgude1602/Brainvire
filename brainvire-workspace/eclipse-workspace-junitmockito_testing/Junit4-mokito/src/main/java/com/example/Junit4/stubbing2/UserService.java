package com.example.Junit4.stubbing2;

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
	
	public int calculateTotalSalary(List<Integer> userId) {
		int totalSalary = 0;
		for(int id : userId) {
			User user = userRepository.findUserByUserId(id);
			totalSalary = totalSalary + user.getUserPayment();
		}
		
		return totalSalary;
	}
	
	public void addUser(User user) {
		userRepository.save(user);	//mockito applies equals here
	}
	
	public void addUser(UserRequest userrequest) {
		User user = new User();
		user.setUserName(userrequest.getUserName());
		user.setUserAddress(userrequest.getUserAddress());
		user.setUserPassword(userrequest.getUserPassword());
		user.setUserPayment(userrequest.getUserPayment());
		userRepository.save(user);	//mockito applies equals here
	}
	
	public void addUserr(UserRequest userRequest) {
		if (userRequest.getUserPayment() <= 500) {
			return;
		}

		User user = new User();
		user.setUserName(userRequest.getUserName());
		user.setUserAddress(userRequest.getUserAddress());
		user.setUserPassword(userRequest.getUserPassword());
		user.setUserPayment(userRequest.getUserPayment());
		userRepository.save(user);

	}

}
