package Pratice_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P76_Inputstream_2_String {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String filename = s.nextLine();

		File file = new File(filename);
		try {
			InputStream is = new FileInputStream(file);

			InputStreamReader isr = new InputStreamReader(is);

			char charArray[] = new char[(int) file.length()];

			isr.read(charArray);

			String contents = new String(charArray);
			System.out.println(contents);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
