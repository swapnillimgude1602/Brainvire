package Pratice_Programs;

import java.util.Scanner;

public class P58_RoundNO_nDecimalPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		String rounded = String.format("%.2f", num);
		double roundedNum = Math.round(Double.parseDouble(rounded));
		System.out.println("Rounded number: " + roundedNum);
	}
}
