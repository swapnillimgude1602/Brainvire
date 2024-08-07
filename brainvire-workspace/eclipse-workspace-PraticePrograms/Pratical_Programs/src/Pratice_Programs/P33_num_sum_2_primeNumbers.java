package Pratice_Programs;

import java.util.Scanner;

public class P33_num_sum_2_primeNumbers {
	
	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	static boolean isPossible(int N) {
		if (isPrime(N) && isPrime(N - 2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int num = sc.nextInt();
        if (isPossible(num) == true) {
            System.out.println("Can be expressed");
        }else {
            System.out.println("Cannot be expressed");
        }
     }
}