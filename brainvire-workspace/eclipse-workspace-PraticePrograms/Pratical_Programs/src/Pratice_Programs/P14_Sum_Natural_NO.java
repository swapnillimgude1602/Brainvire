package Pratice_Programs;

import java.util.Scanner;

public class P14_Sum_Natural_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int start = 1;
		int sum = 0;
		while (start <= num) {
			//sum = sum + start;
			sum = ((start*(start+1))/2);
			start++;
		}
		System.out.println("Sum of Natural Numbers: " + sum);

	}

}
