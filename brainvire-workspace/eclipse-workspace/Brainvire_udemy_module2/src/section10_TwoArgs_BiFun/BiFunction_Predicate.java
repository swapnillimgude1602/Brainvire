package section10_TwoArgs_BiFun;

import java.util.function.BiPredicate;

public class BiFunction_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer>  bp = (a,b) -> (a+b)%2==0;
		
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(11, 20));
		
		BiPredicate<Integer, String> bp1 = (a,b) ->
		{
			if(a == Integer.parseInt(b) )
				return true;
			return false;
		};
		
		System.out.println(bp1.test(12, "12"));

	}

}
