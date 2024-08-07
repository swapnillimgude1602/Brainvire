package Pratice_Programs;

import java.io.File;

public class P110_DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Pratice.txt");
		boolean res = file.delete();
		if(res==true) {
			System.out.println("File deleted");
		}
		else {
			System.out.println("not deleted");
		}
	}

}
