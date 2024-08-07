package Pratice_Programs;

public class P40_Reverse_String_Recursion {

	public String reverse(String str) {
		if (str.isEmpty() != true) {
			return reverse(str.substring(1)) + str.charAt(0);

		} else {
			return str;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P40_Reverse_String_Recursion sr = new P40_Reverse_String_Recursion();
		String rev = sr.reverse("hellosir");
		System.out.println("Reverse String: " + rev);

	}

}
