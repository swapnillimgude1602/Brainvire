package Pratice_Programs;

public class P62_Check_string_empNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "";
		String str2 = null;
		String str3 = "hello";

		if (str1 == null || str1.isEmpty()) {
			System.out.println("str1 is either empty or null");
		} else {
			System.out.println("str1 is not empty or null");
		}

		if (str2 == null || str2.isEmpty()) {
			System.out.println("str2 is either empty or null");
		} else 
		{
			System.out.println("str2 is not empty or null");
		}

		if (str3 == null || str3.isEmpty()) {
			System.out.println("str3 is either empty or null");
		} else {
			System.out.println("str3 is not empty or null");
		}
	}

}
