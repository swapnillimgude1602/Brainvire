package Pratice_Programs;

import java.util.Scanner;

public class P125_Firstword_Capital_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		boolean space = true;

		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				if (space) {
					ch[i] = Character.toUpperCase(ch[i]);
					space = false;
				}
			} 
			else {
				space = true;
			}
		}

		str = String.valueOf(ch);
		System.out.println("Converted: " + str);

	}

}
