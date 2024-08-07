package section10_TwoArgs_BiFun;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_Chainnig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,String> f1 = (s1,s2) -> s1.toUpperCase()+s2.charAt(2);
		Function<String,String> f2 = s1 -> s1.toUpperCase();
			
		System.out.println(f1.andThen(f2).apply("Swap", "Swapnil"));
	}

}
