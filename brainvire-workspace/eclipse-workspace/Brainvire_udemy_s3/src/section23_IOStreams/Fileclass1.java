package section23_IOStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileclass1 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		
		f.setReadOnly();
		//f.setReadable(false);
		//f.setWritable(true);
		
		System.out.println(f.lastModified());	
		
		System.out.println(f.isFile());
		
		FileOutputStream fos = new FileOutputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		fos.write(10);
			
	}

}
