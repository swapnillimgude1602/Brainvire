package section25_collection;
import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "name=swap;add=pune;country=india;dept=cse";
		
		StringTokenizer st = new StringTokenizer(str,"=;");
		
		String s;
		while(st.hasMoreTokens())
		{
			s=st.nextToken();
			System.out.println(s);
		}
		
	}

}
