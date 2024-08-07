package Pratice_Programs;

import java.io.PrintWriter;
import java.io.StringWriter;

public class P74_StackTrace_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int ans = 10 / 0;
		} catch (Exception e) {
			StringWriter sw = new StringWriter();

			// writing the stack trace in the writer
			e.printStackTrace(new PrintWriter(sw));
			String str = sw.toString();
			System.out.println(str);
		}
	}

}
