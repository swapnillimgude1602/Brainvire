package section20_Java_lang_pkg;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//types to declare number class ()
		Integer i = new Integer(10);
		Integer i1 = Integer.valueOf(20);
		Integer i2 = 10;
		
		Byte bb = new Byte("20");
		Byte bb1 = Byte.valueOf("123");
		
		byte bb2 = 18;
		Byte bb3 = Byte.valueOf(bb2);
		System.out.println(bb3);

		
		Short s = new Short("12");
		
		Float f1 = new Float(23f);
		Float f2 = Float.valueOf(23f);
		Float f3 = 12f;
		System.out.println(f3);

		
		Double d = new Double(12);
		Double d1 = Double.valueOf(0);
		System.out.println(d1);

		Character c = new Character('A');
		Character c1 = Character.valueOf('A');
		System.out.println(c1);

		
		Boolean b = Boolean.valueOf(true);
		System.out.println(b);
	}

}
