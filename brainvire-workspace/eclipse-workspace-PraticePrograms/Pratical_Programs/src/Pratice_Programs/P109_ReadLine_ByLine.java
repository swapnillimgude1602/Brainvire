package Pratice_Programs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P109_ReadLine_ByLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-PraticePrograms/Pratical_Programs/Pratice.txt");
		BufferedInputStream input = new BufferedInputStream(file);
		int i = input.read();
		while (i != -1) {
			System.out.print((char) i);
			i = input.read();
		}
		input.close();
	}

}
