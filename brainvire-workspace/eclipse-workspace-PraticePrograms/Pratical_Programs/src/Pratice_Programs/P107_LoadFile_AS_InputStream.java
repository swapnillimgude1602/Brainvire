package Pratice_Programs;

import java.io.FileInputStream;
import java.io.InputStream;

public class P107_LoadFile_AS_InputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream input = new FileInputStream("Pratice.txt");
			System.out.println("Reading File:  ");
			int i = input.read();
			while (i != -1) {
				System.out.print((char) i);
				i = input.read();
			}
			input.close();
		} catch (Exception ex) {
			System.out.println("error" + ex.getMessage());
		}

	}

}
