package Pratice_Programs;

import java.util.Scanner;

public class P6_Swap2_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers to swap: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("before Swap: "+num1+" " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap: "+num1+" " + num2);		
	}

}
