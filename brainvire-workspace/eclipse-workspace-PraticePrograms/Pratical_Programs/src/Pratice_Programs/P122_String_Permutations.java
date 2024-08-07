package Pratice_Programs;

public class P122_String_Permutations {

	static void stringPer(String str, String res) {
		if (str.length() == 0) {
			System.out.print(res + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String remString = str.substring(0, i) + str.substring(i + 1);
			stringPer(remString, res + ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		stringPer(str, "");
	}

}
