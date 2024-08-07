package JunitMockito.com.demo.ArgumentCaptor;

import java.util.Objects;

public class User {

	private int userId;
	private String userName;
	private String userAddress;
	private String userPassword;
	private int userPayment;

	public User(int userId, String userName, String userAddress, String userPassword, int userPayment) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPassword = userPassword;
		this.userPayment = userPayment;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(int userPayment) {
		this.userPayment = userPayment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userAddress, userId, userName, userPassword, userPayment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userAddress, other.userAddress) && userId == other.userId
				&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword)
				&& userPayment == other.userPayment;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userPassword="
				+ userPassword + ", userPayment=" + userPayment + "]";
	}

}
