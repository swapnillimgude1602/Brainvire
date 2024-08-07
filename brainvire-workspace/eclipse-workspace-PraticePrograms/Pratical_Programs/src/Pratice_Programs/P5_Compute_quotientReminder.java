package Pratice_Programs;

import java.util.Scanner;

public class P5_Compute_quotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divisor and Divident: ");
		int Divisor = sc.nextInt();
		int Divident = sc.nextInt();

		int Quotient = Divisor / Divident;
		int Reminder = Divisor % Divident;

		System.out.println("Quotient is: " + Quotient);
		System.out.println("Reminder is: " + Reminder);

	}

}
