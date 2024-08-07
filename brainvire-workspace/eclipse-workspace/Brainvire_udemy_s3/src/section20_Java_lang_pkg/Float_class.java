package section20_Java_lang_pkg;

public class Float_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f1 = 23f;
		Float f2 = 32f;
		Float f3 = 23f/0;
		Float f4 = (float)Math.sqrt(-1);
		
		System.out.println(f2.equals(f1));	//boolean result
		System.out.println(f3.isInfinite());	//boolean result checks for infinite result
		System.out.println(f4.isNaN());		//boolean result checks if not a number
		System.out.println(f2==Float.POSITIVE_INFINITY); 	//static member checks for infinite result
	}

}
