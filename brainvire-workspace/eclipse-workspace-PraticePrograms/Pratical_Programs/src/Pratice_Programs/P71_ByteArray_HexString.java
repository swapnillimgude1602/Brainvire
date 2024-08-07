package Pratice_Programs;

public class P71_ByteArray_HexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytearr = { 1, -2, 3, -4, 5, -6 };
		StringBuilder sb = new StringBuilder();
		for (byte num : bytearr) {
			sb.append(String.format("%02X ", num));
		}
		System.out.println(sb.toString());
	}
}
