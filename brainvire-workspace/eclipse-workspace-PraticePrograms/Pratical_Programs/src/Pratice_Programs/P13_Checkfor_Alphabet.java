package Pratice_Programs;

import java.util.Scanner;

public class P13_Checkfor_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single Character: ");
		char ch = sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("It is an alphabet");
		} else {
			System.out.println("It is not an alphabet");

		}
	}

}
