package Pratice_Programs;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class P105_String_inputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "Swapnil here i am";
		System.out.println("String: " + str);

		InputStream is = new ByteArrayInputStream(str.getBytes());
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("InputStream: "+br.readLine());

	}

}
