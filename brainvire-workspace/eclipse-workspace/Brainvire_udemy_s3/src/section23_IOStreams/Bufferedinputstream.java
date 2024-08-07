package section23_IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
public class Bufferedinputstream {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);	//temporary memory
		
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}

	}

}
