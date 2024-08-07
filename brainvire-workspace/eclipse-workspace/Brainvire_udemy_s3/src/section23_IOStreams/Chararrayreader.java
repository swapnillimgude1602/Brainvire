package section23_IOStreams;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chararrayreader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		char c[] = { 'a', 'b', 'c', 'd', 'e' };
		CharArrayReader cr = new CharArrayReader(c);
		int x;
		while ((x = cr.read()) != -1) {
			System.out.print((char) x);
		}

	}

}
