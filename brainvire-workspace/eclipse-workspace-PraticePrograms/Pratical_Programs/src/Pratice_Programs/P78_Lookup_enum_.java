package Pratice_Programs;

import java.util.Scanner;

public class P78_Lookup_enum_ {

	public enum Cars {
		BMW, MERCI, GMC, JAGUAR
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a car name to lookup: ");
		String carName = sc.next();
		System.out.println("The string is to lookup is: " + carName);
		Cars result = Cars.valueOf(carName.toUpperCase());
		System.out.println(result);
	}
}
