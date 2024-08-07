package Pratice_Programs;

import java.io.File;

public class P113_GetFileName_AbsolutePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    File file = new File("/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-PraticePrograms/Pratical_Programs");

	    String fileName = file.getName();
	    System.out.println("File Name: " + fileName);


	}

}
