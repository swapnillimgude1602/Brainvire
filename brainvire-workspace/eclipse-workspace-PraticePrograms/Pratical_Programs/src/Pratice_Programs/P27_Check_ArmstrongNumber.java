package Pratice_Programs;

import java.util.Scanner;

public class P27_Check_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for Armstrong Number: ");
		int num = sc.nextInt();
		int rem = 0, res = 0;
		int orignalNumber = num;
		while (num != 0) {
			rem = num % 10;
			res = res + rem * rem * rem;
			num = num / 10;
		}
		if (orignalNumber == res) {
			System.out.println("Number is Armstrong:" + orignalNumber);
		} else {
			System.out.println("Number is not Armstrong" + orignalNumber);

		}
	}
}
