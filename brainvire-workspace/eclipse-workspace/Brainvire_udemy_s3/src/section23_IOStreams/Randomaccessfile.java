package section23_IOStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomaccessfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			RandomAccessFile raf = new RandomAccessFile("/home/swapnil_limgude/iostreams/randomaccess.txt", "rw");	//Read and write
			System.out.println((char)raf.read());
			System.out.println((char)raf.read());
			System.out.println((char)raf.read());//read byte by byte data
			
			raf.write('D');			//writes data at pointer location

			System.out.println((char)raf.read());
			raf.skipBytes(5);		//Skips the number of bytes.
			
			System.out.println((char)raf.read());
			
			System.out.println("file pointer loc "+raf.getFilePointer());	//Get loc of pointer
			
			raf.seek(raf.getFilePointer()-2);		//Moves the file pointer location by -2.
			
			System.out.println("file pointer loc "+raf.getFilePointer());

			
		}
		catch(FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}

	}

}
