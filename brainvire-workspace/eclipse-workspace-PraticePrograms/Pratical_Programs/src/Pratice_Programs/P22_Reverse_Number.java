package Pratice_Programs;

import java.util.Scanner;

public class P22_Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print reverse: ");
		int num = sc.nextInt();
		int rem = 0, res = 0;
		while (num != 0) {
			rem = num % 10;
			res = (10 * res) + rem;
			num = num / 10;
		}
		System.out.println("Reverse Number is:" + res);

	}

}
