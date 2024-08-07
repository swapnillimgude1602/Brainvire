package section7_PredefinedFunction_Function;

import java.util.function.Function;

public class Function_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) andThen() - fn1 followed by fn2
		// 2) compose() - fn2 followed by fn1
		
		Function<String,String> f1 = s -> s.toUpperCase();
		Function<String,String> f2 = s -> s.substring(0,5);
		
		Function<Integer,Integer> f3 = s -> s+s;
		Function<Integer,Integer> f4 = s -> s*s*s;
		
		System.out.println(f1.apply("Swapnil"));
		System.out.println(f2.apply("Swapnil"));
		
		System.out.println(f1.andThen(f2).apply("Swapnil"));
		System.out.println(f1.compose(f2).apply("Swapnil"));
		
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));

		

		

	}

}
