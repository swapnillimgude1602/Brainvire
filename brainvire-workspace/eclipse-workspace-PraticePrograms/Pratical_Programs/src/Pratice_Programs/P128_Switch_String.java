package Pratice_Programs;

import java.util.Scanner;

public class P128_Switch_String {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		String ch;
		System.out.println("1: Addition \n2: Subtraction\n3: Multiplication \n4: Division");
		System.out.println("Enter your choice: ");
		ch = sc.next();
		switch (ch) {
		case "Addition":
			System.out.println("Addition");
			System.out.println("Enter values for addition: ");
			a = sc.nextInt();
			b = sc.nextInt();
			int add = a + b;
			System.out.println("Addition is: " + add);
			break;

		case "Subtraction":
			System.out.println("Subtraction");
			System.out.println("Enter values for addition: ");
			a = sc.nextInt();
			b = sc.nextInt();
			int sub = a - b;
			System.out.println("Subtraction is: " + sub);
			break;

		case "Multiplication":
			System.out.println("Multiplication");
			System.out.println("Enter values for Multiplication: ");
			a = sc.nextInt();
			b = sc.nextInt();
			int mul = a * b;
			System.out.println("Multiplication is: " + mul);
			break;

		case "Division":
			System.out.println("Division");
			System.out.println("Enter values for Division: ");
			a = sc.nextInt();
			b = sc.nextInt();
			int div = a / b;
			System.out.println("Division is: " + div);
			break;

		default:
			System.out.println("Enter a valid choice");
			break;
		}

	}

}
