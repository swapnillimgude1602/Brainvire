package Pratice_Programs;

import java.util.Scanner;

public class P19_Find_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers respectively: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res;

		// check for greater number.
		res = (num1 > num2) ? num1 : num2;

		// check smallest number divide by both
		while (true) {
			if (res % num1 == 0 && res % num2 == 0) {
				break;
			}
			res++;
		}
		System.out.println("LCM is: " + res);
	}

}
