package Pratice_Programs;

import java.util.Scanner;

public class P16_Gen_Multipli_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for multiplication: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int mul = i * num;
			System.out.println("Enter the number for multiplication: " + mul);
		}
		sc.close();
	}

}
