package section23_IOStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreader {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		
		BufferedReader bis = new BufferedReader(fr);
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(5);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		System.out.println(bis.readLine());	//reads the  string remaining
		System.out.println(bis.ready());	//tell stream is ready to read	
		

	}

}
