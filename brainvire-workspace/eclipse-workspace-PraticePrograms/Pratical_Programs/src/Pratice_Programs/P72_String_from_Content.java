package Pratice_Programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P72_String_from_Content {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get(
				"/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-PraticePrograms/Pratical_Programs/Pratice.txt");
		String content = Files.readString(path);
		System.out.println("StringContent: " +content);
	}

}
