package Pratice_Programs;

import java.util.Scanner;

public class P26_Primeno_2_Intervas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, last, i;
		boolean my_temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start: ");
		start = sc.nextInt();
		System.out.print("Enter an end: ");
		last = sc.nextInt();

		System.out.println("The prime numbers are:");
		while (start < last) {
			my_temp = false;
			for (i = 2; i <= start / 2; ++i) {
				if (start % i == 0) {
					my_temp = true;
					break;
				}
			}
			if (!my_temp && start != 0 && start != 1)
				System.out.print(start + " ");
			++start;
		}

	}

}
