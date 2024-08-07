package Pratice_Programs;

public class P79_Compare_2_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Swapnil");
		String str2 = new String("swapnil");
		
		//comparing strings
		if(str1.equals(str2)) {
			System.out.println("string equals");
		}
		else {
			System.out.println("not equals");

		}
		//casesensetive
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("string equals case");
		}
		else {
			System.out.println("not equals case");

		}
	}

}
