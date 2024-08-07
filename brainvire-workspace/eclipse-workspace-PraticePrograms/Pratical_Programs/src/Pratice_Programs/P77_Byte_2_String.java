package Pratice_Programs;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class P77_Byte_2_String {

	public static void main(String[] args) throws IOException {

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		String st = "hello Swapnil";

		stream.write(st.getBytes());

		// converting stream to byte array and converting into string
		String finalString = new String(stream.toByteArray());

		System.out.println(finalString);
	}
}
