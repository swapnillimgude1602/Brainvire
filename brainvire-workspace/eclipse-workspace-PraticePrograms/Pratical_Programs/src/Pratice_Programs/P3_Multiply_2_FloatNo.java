package Pratice_Programs;

import java.util.Scanner;

public class P3_Multiply_2_FloatNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num1, num2, num3;
		System.out.println("Enter value for num1 & num2: ");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		num3 = num1 + num2;
		System.out.println("Multiplication of Integer is: " + num3);
		System.out.printf("Multiplication of %.2f and %.2f is: %.2f ", num1, num2, num3);
		sc.close();
	}

}
