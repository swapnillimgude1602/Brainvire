package section20_Java_lang_pkg;

//Wrapper classes
public class Char_Boolean_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Character class
		Character C = Character.valueOf('A');
		char c1 = 'B';
		System.out.println(C.charValue());
		System.out.println(C.equals(c1));
		System.out.println(C.compareTo(C));
		System.out.println(Character.toLowerCase(c1));
		System.out.println(Character.toUpperCase(c1));
		
		
		//Boolean Class
		Boolean A = Boolean.valueOf("234");
		Boolean B = Boolean.valueOf("234");
		System.out.println(B.booleanValue());
		System.out.println(B.compareTo(A));
		//System.out.println(Boolean.hashCode(false));

	}

}
