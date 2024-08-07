package Pratice_Programs;

import java.util.Scanner;

public class P39_binary_octal_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first binary to decimal and then decimal to octal
		Scanner sc = new Scanner(System.in);
		String binaryNum = sc.next();
		int decimal = Integer.parseInt(binaryNum, 2);
		System.out.println("Decimal: " + decimal);
		String octal = Integer.toOctalString(decimal);
		System.out.println("Octal: " + octal);
	}

}
