package Pratice_Programs;

import java.util.Scanner;

public class P17_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("Fibonacci Series:");
		System.out.print(a+""+b);
		for(int i=2;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c);
		}
	}

}
