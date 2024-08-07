package JunitMockito.com.demo.Mock;

public class User {

	private int userId;
	private int addId;
	private String userName;
	private String userAddress;
	private String userPassword;

	
	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
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

	
	public User(int userId, int addId, String userName, String userAddress, String userPassword) {
		super();
		this.userId = userId;
		this.addId = addId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPassword = userPassword;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userPassword="
				+ userPassword + "]";
	}

}
