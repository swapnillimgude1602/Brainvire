package Pratice_Programs;

import java.util.Scanner;

public class P25_Check_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for Prime: ");
		int num = sc.nextInt();
		for (int i = 0; i <= num / 2; i++) {
			if (num % 2 == 0) {
				System.out.println("Number is Prime");
				return;

			} else {
				System.out.println("Number is Not Prime");
				return;
			}
		}

	}

}	
