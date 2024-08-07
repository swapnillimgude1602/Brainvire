package Pratice_Programs;

import java.util.Scanner;

public class P1_Add_2_Integers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter value for num1 & num2: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = num1 + num2;
		System.out.println("Addition of Integer is: " + num3);
		System.out.format("Addition of %d and %d is: %d ", num1, num2, num3);
		sc.close();
	}
}
