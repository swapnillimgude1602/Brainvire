package Pratice_Programs;

import java.io.File;

public class P111_deleteDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("/home/swapnil_limgude/brainvire-workspace/eclipse-workspace-PraticePrograms/Pratical_Programs");
		boolean res = directory.delete();
		if(res==true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not deleted");
		}

	}

}
