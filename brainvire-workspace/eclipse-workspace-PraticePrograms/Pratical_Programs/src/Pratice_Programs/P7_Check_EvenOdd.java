package Pratice_Programs;

import java.util.Scanner;

public class P7_Check_EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for Even Odd: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is even number: " + num);
		} else {
			System.out.println("Number is odd number: 	" + num);
		}
	}
}