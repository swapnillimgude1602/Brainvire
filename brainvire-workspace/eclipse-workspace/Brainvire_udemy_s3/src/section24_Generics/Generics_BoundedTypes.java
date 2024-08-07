package section24_Generics;

public class Generics_BoundedTypes {
	
	static <E extends Number> void show(E... list) { // <E> is a generic method which extends number Type data
		for (E x : list) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
		show(new Integer[] { 10, 12, 12, 12, 23 });
		show(10, 12, 12, 12, 23);
		show(new Float[] {1.0f,3.4f,9.3f});

	}

}
