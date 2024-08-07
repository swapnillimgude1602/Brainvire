package Pratice_Programs;

import java.util.Scanner;

public class P28_Armstrong_2_Intervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lower limit: ");
		int lowerLimit = sc.nextInt();

		System.out.print("Enter the upper limit: ");
		int upperLimit = sc.nextInt();

		System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are:");
		printArmstrongNumbers(lowerLimit, upperLimit);
	}

	// Function to check if a number is an Armstrong number
	private static boolean isArmstrong(int number) {
		int originalNumber, remainder, result = 0, n = 0;

		originalNumber = number;

		// Find the number of digits
		while (originalNumber != 0) {
			originalNumber /= 10;
			++n;
		}

		originalNumber = number;

		// Calculate the result
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /= 10;
		}

		// Check if the number is Armstrong
		return result == number;
	}

	// Function to print Armstrong numbers between two intervals
	private static void printArmstrongNumbers(int lowerLimit, int upperLimit) {
		for (int i = lowerLimit; i <= upperLimit; ++i) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
