package Pratice_Programs;

import java.util.Scanner;

public class P18_Find_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers respectively: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd=i;
			}
		}
		System.out.println(gcd);

	}

}
