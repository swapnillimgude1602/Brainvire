package Pratice_Programs;

import java.util.Scanner;

public class P103_MethCall_argument_AnotherMethod {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public void multiply(int num) {
		int result = num * num;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 and num2: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		P103_MethCall_argument_AnotherMethod obj = new P103_MethCall_argument_AnotherMethod();

		obj.multiply(obj.add(num1, num2));

	}
}
