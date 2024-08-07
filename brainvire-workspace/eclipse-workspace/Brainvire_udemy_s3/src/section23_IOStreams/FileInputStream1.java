package section23_IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		byte [] b = new byte[fis.available()]; 	//check if there is content in the file.
		fis.read(b);
		String str = new String(b);
		System.out.println(str);
		fis.close();
		}
		
		catch(FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
		
		}
	
	}


