package Pratice_Programs;

import java.nio.file.Path;
import java.nio.file.Paths;

public class P114_RelativePath_2_AbsolutePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path absolutePath1 = Paths
				.get("/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-PraticePrograms/Pratical_Programs");
		Path absolutePath2 = Paths.get("/home/swapnil_limgude/");
		// convert the absolute path to relative path
		Path relativePath = absolutePath2.relativize(absolutePath1);
		System.out.println("Relative Path: " + relativePath);

	}

}