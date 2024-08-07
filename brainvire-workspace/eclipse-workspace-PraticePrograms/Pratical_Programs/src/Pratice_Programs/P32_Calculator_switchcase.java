package Pratice_Programs;

import java.util.Scanner;

public class P32_Calculator_switchcase {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, ch;
		do{
			System.out.println("1: Addition \n2: Subtraction\n3: Multiplication \n4: Division");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Addition");
				System.out.println("Enter values for addition: ");
				a = sc.nextInt();
				b = sc.nextInt();
				int add = a + b;
				System.out.println("Addition is: " + add);
				break;

			case 2:
				System.out.println("Subtraction");
				System.out.println("Enter values for addition: ");
				a = sc.nextInt();
				b = sc.nextInt();
				int sub = a - b;
				System.out.println("Subtraction is: " + sub);
				break;

			case 3:
				System.out.println("Multiplication");
				System.out.println("Enter values for Multiplication: ");
				a = sc.nextInt();
				b = sc.nextInt();
				int mul = a * b;
				System.out.println("Multiplication is: " + mul);
				break;

			case 4:
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
		}while (ch <= 4);

	}

}
