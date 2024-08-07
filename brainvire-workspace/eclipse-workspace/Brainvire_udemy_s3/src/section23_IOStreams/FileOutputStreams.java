package section23_IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		String str = "Brainvire infotech";
		byte [] b = str.getBytes();
		
		//Write classes
		//fos.write(str.getBytes()); 
		//fos.write(b);
		fos.write(str.getBytes(), 2, 5);
		fos.close();

	}

}
