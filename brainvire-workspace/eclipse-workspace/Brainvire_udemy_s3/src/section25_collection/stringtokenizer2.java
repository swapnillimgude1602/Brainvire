package section25_collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class stringtokenizer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/token.txt");
		byte b[] = new byte[fis.available()];
		fis.read(b);
		String str = new String(b);
 		StringTokenizer st = new StringTokenizer(str, "=;");

		String s;
		while (st.hasMoreTokens()) {
			s = st.nextToken();
			System.out.println(s);
		}
		}catch(IOException e) 
		{
			System.out.println(e);
		}

	}

}
