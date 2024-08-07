package section23_IOStreams;

import java.io.ByteArrayInputStream;

public class Bytearrayinputstream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {'a','b','c','c'};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.println((char)x);	//Reads one byte at  time 
		}

	}

}
