package Pratice_Programs;

import java.util.Scanner;

public class P9_3_num_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Largest number: "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Largest number: "+num2);
		}
		else {
			System.out.println("Largest number"+num3);
		}
		
		int num4 = num3 > ((num1>num2)?num1:num2)?num3:((num1>num2)?num1:num2);
		System.out.println("Largest number"+num4);

	}

}
