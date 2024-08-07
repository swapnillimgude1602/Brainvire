package Pratice_Programs;

import java.util.Scanner;

public class P24_Check_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for Palindrome: ");
		int num = sc.nextInt();
		int rem = 0, res = 0;
		int orignalNumber = num;
		while (num != 0) {
			rem = num % 10;
			res = (10 * res) + rem;
			num = num / 10;
		}
		if (orignalNumber == res) {
			System.out.println("Number is Palindrome:" + orignalNumber);
		} else {
			System.out.println("Number is not Palindrome" + orignalNumber);

		}
	}

}