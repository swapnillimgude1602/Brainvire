package Pratice_Programs;

public class P95_Primitive_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitive to object
		int num1 = 345;
		double num2 = 12.2D;

		Integer i1 = Integer.valueOf(num1);
		Double d1 = Double.valueOf(num2);

		System.out.println(i1);
		System.out.println(d1);

		// obj to primitive
		int a = i1.intValue();
		double b = d1.doubleValue();
		System.out.println(a);
		System.out.println(b);

	}

}
