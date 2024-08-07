package section10_TwoArgs_BiFun;

import java.util.function.BiPredicate;

public class BiFunction_Predicate_Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;

		BiPredicate<Integer, Integer> bp1 = (a, b) -> a>b;
			
		BiPredicate<Integer, Integer> bp2 = bp.and(bp1);
		System.out.println(bp2.test(10, 23));
		
		boolean result = bp.or(bp1).test(10, 2);
		System.out.println(result);
		
		boolean result1 = bp.negate().test(10, 2);
		System.out.println(result1);

	}
}
