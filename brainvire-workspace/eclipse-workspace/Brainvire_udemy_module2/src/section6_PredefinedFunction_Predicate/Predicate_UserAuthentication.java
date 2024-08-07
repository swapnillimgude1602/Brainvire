package section6_PredefinedFunction_Predicate;

import java.util.Scanner;

class User
{
	String username;
	String password;
	
	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	
}
public class Predicate_UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <User> pp = u -> u.username.equals("swap") && u.password.equals("1602");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String uname = sc.next();
		System.out.println("Enter Password :");
		String pass = sc.next();
		
		User user = new User(uname, pass);
		if(pp.test(user))
		{
			System.out.println("Valid User");
			
		}
		else
		{
			System.out.println("Invalid User");
		}

	}

}
