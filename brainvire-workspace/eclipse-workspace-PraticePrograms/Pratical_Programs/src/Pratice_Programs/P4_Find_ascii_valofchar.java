package Pratice_Programs;

import java.util.Scanner;

public class P4_Find_ascii_valofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character for ascii: ");
		char ch = sc.next().charAt(0);
		int ascii = (int) ch;
		System.out.println("Ascii value of character: " + ascii);
		sc.close();
	}

}
