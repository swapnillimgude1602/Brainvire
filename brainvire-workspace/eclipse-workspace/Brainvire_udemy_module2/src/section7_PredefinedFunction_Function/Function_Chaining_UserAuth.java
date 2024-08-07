//package section7_PredefinedFunction_Function;
//
//import java.util.Scanner;
//import java.util.function.Function;
//
///*
// * username - only 5 char it will take.
// * password - only specified smallcase.
// */
//public class Function_Chaining_UserAuth {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// 1) andThen() - fn1 followed by fn2
//		// 2) compose() - fn2 followed by fn1
//		
//		Function<String, String> f1 = s -> s.toLowerCase();
//		Function<String, String> f2 = s -> s.substring(0,5);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter UserName : ");
//		String userName=sc.next();
//		
//		System.out.println("Enter Password : ");
//		String password=sc.next();
//		
//		if(f1.andThen(f2).apply(userName).equals("Swapnil") && password.equals("swap"))
//			System.out.println("Valid User");
//		else
//			System.out.println("Invalid User");
//	}
//
//}
