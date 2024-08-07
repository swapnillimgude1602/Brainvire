package Pratice_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class P121_String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String str1 = sc.next();
		System.out.println("Enter 2st String: ");
		String str2 = sc.next();

		if (str1.length() != str2.length()) {
			System.out.println("Strings are not Anagram");
		} else {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			char[] strr1 = str1.toCharArray();
			char[] strr2 = str2.toCharArray();
			Arrays.sort(strr1);
			Arrays.sort(strr2);

			if (Arrays.equals(strr1, strr2) == true) {
				System.out.println("String are Anagram");
			} else {
				System.out.println("String are Not Anagram");
			}
		}

	}

}
