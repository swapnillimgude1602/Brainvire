package Pratice_Programs;

import java.util.Scanner;

public class P12_Check_PosNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for Positive or negative: ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Number is Positive number: " + num);
		} else if (num == 0) {
			System.out.println("Number is Zero:" + num);
		} else {
			System.out.println("Number is negative number: 	" + num);
		}
		sc.close();
	}

}
