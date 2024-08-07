package section23_IOStreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		FileReader fr = new FileReader("/home/swapnil_limgude/iostreams/OutputStream1.txt");
		int x;;
		
		while((x=fr.read())!=-1)
		{
				System.out.print((char)x);
		}
		
		fr.close();
		}
		catch(IOException e) {System.out.println(e);}
	
	}

}
