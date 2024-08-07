package Pratice_Programs;

import java.util.Scanner;

public class P8_Check_VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single Character: ");
		String arr[] = { "a", "e", "i", "o", "u" };
		String ch = sc.next();
		for (int i = 0; i < arr.length; i++) {
			if (ch.equals(arr[i])) {
				System.out.println("It is Vowel");
				return;
			}

		}
		System.out.println("It is consonent");

	}
}