package Pratice_Programs;

public class P112_FileExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "Pratice.txt";
		int index = file.lastIndexOf(".");
		String fileExtension = file.substring(index + 1);
		System.out.println("Extension: " + fileExtension);

	}

}
