package Pratice_Programs;

import java.util.Scanner;

public class P30_ArmstrongNo_2_intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start and end: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int rem, sum=0, num;
		for (int i = start; i < end; i++) {
			num = i;
			while (num != 0) {
				rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}
			if (sum == i) {
				System.out.println("Armstrong numbers: " + i);
			}
		}
	}
}
