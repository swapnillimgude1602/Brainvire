package Pratice_Programs;

public class P37_Binary_decimal_vv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Binary to decimal
		String Bin = "1101";
		int deci = Integer.parseInt(Bin, 2);
		System.out.println(deci);

		// decimal to binary
		String bin = Integer.toBinaryString(deci);
		System.out.println(bin);

	}

}
