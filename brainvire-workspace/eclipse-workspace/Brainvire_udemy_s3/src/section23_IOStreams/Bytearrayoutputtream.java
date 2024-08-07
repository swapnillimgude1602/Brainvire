package section23_IOStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytearrayoutputtream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		
		bos.writeTo(new FileOutputStream("/home/swapnil_limgude/iostreams/Bytearray.txt"));	//write into file
		
		byte b[] = bos.toByteArray();	//Allocates new byte array
		for(byte x: b)
		{
			System.out.print((char)x);
		}
		bos.close();
		}
		catch(IOException e) {System.out.println(e);}
	}

}
