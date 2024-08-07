package section23_IOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bufferedinputstream1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		bis.mark(5);	//pointer is marked
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		bis.reset();	//rest the pointer at mark
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		
		

	}

}
