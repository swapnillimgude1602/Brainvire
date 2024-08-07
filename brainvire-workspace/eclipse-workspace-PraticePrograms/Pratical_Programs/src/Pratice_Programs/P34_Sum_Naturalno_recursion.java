package Pratice_Programs;

import java.util.Scanner;

public class P34_Sum_Naturalno_recursion {

	static int sumOfNaturalNumbers(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sumOfNaturalNumbers(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			int sum = sumOfNaturalNumbers(number);
			System.out.println("Sum of first " + number + " natural numbers: " + sum);
		}

		scanner.close();
	}
}