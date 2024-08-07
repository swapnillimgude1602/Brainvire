package Pratice_Programs;

public class P55_Remove_whitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab lnadjnb adjknb";
		String newstr = str.replace(" ", "");
		System.out.println(newstr);

// Another Logic
		String a = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				a += ch;
			}
		}
		System.out.println(a);

	}

}
