package section6_PredefinedFunction_Predicate;
import java.util.function.Predicate;

public class Predicate_joining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 5, 10, 15, 20, 25, 30, 35 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("The number greater than 10 are:");
		m1(p1, x);
		
		System.out.println("The even number are:");
		m1(p2, x);
		
		System.out.println("The numbers are not greater than 10 ");
		m1(p1.negate(),x);
		
		System.out.println("The number greater than 10 and even are: ");
		m1(p1.and(p2),x);
		
		System.out.println("The number greater than 10 OR even are");
		m1(p1.or(p2),x);
	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int z : x) {
			if (p.test(z)) {
				System.out.println(z);
			}
		}
	}
}
