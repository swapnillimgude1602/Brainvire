package Pratice_Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P73_Append_Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty(
				"/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-PraticePrograms/Pratical_Programs/Pratice.txt");
		String appendString = "I am 4th Line";
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))) {
			bf.write(appendString);
			bf.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
