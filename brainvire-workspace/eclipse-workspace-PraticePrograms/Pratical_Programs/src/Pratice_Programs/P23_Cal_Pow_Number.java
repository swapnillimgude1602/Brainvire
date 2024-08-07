package Pratice_Programs;

import java.util.Scanner;

public class P23_Cal_Pow_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base and Power: ");
		int base = sc.nextInt();
		int power = sc.nextInt();
		int result=1;
		for(int i=0;i<power;i++) {
			result*=base; 
		}
		System.out.println(result);
	}

}
	