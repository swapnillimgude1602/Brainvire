package Pratice_Programs;
import java.util.Scanner;

public class P29_PrimeNo_Interval_Fun {

	public class PrimeNumbersBetweenIntervals {

		static boolean isPrime(int num) {
			if (num <= 1) {
				return false;
			}
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the lower limit of the interval: ");
			int lowerLimit = scanner.nextInt();

			System.out.print("Enter the upper limit of the interval: ");
			int upperLimit = scanner.nextInt();

			System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
			for (int i = lowerLimit; i <= upperLimit; i++) {
				if (isPrime(i)) {
					System.out.print(i + " ");
				}
			}

			scanner.close();
		}
	}

}
