package section23_IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream2 {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		int x;;
		
		while((x=fis.read())!=-1)
		{
				System.out.print((char)x);
		}
		fis.close();
	}

}
