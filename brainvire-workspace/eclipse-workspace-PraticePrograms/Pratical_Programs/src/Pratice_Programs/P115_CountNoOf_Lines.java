package Pratice_Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P115_CountNoOf_Lines {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File("Pratice.txt");
		int count = 0;
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			sc.nextLine();
			count++;
		}
		System.out.println("Number of Lines: " + count);
	}
}
