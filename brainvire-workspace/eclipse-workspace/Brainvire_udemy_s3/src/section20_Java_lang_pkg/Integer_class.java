package section20_Java_lang_pkg;

public class Integer_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1 = 15;
		Integer m2=m1;
		
		System.out.println(m2.compareTo(m1));	//result in 0,1,-1
		System.out.println(m2.equals(m1));	//Returns in boolean t/f
		
		//Static methods
		Integer m3 = Integer.valueOf("123");
		System.out.println(m3);
		
		System.out.println(Integer.valueOf("1010",2));	//Binary Conversion
		System.out.println(Integer.bitCount(1234));
		System.out.println(Integer.compareUnsigned(123, m1));
		System.out.println(Integer.decode("0XA7"));	//Decode into hexaD
		System.out.println(Integer.reverse(123));	//
		System.out.println(Integer.toBinaryString(m1));
	}

}
