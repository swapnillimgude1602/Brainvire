package Pratice_Programs;

import java.util.Scanner;

public class P11_Check_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year to check: ");
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("It's a leap year");
		} else {
			System.out.println("It's not a leap year");

		}

	}

}
