package Pratice_Programs;

public class P127_StringOP_vs_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Swapnil";
		String str2 = "swapnil";
		int val1 = 12;
		int val2 = 12;
		// Operator
		if (val1 == val2) {
			System.out.println("num equal");
		} else {
			System.out.println("num not equal");
		}
		// method
		if (str1.equals(str2)) {
			System.out.println("string equal");
		} else {
			System.out.println("String not equal");
		}
	}

}
