package Pratice_Programs;

import java.util.Scanner;

public class P132_Check_3_BoolValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Boolean Value: ");
		boolean b1 = sc.nextBoolean();
		
		System.out.println("Enter 2nd Boolean Value: ");
		boolean b2 = sc.nextBoolean();
		
		System.out.println("Enter 3rd Boolean Value: ");
		boolean b3 = sc.nextBoolean();
		
		int result = (b1 ? 1:0)+(b2 ? 1:0)+(b3 ? 1:0);
		
		if(result==2) {
			System.out.println("two of three values are true");
		}
		else {
			System.out.println("not true two of three values");
		}

	}

}
