package section23_IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos = new FileOutputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		String str = "Brainvire infotech";
		
		//write classes
		fos.write(str.getBytes()); 
		//fos.write(b);
		
		fos.close();
		}
		catch(IOException e) {System.out.println(e);}
	}

}
