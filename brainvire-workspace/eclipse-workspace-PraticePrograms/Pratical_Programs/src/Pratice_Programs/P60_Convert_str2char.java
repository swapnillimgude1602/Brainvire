package Pratice_Programs;

public class P60_Convert_str2char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ca = { 'a', 'b', 'c' };
		String str = String.valueOf(ca);
		// recommended way
		str = new String(ca);
		System.out.println(str);

		String str1 = "Swapnil";
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			System.out.print(ch + " ");
		}
	}

}
