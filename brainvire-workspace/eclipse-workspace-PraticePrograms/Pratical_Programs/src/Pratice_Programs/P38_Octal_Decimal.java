package Pratice_Programs;

public class P38_Octal_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Octal to decimal
		String oct = "135";
		int deci = Integer.parseInt(oct, 8);
		System.out.println(deci);

		// decimal to octal
		String octal = Integer.toOctalString(deci);
		System.out.println(octal);
	}

}
