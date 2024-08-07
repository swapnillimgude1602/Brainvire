package section20_Java_lang_pkg;

public class Autoboxing_unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 50f;
		Float ff = Float.valueOf(f);	//boxing
		Float f1 = f;	//Autoboxing: primitive into object
		float f2 = f1;	//Autounboxing: Object into Primitive
		
		
	}

}
