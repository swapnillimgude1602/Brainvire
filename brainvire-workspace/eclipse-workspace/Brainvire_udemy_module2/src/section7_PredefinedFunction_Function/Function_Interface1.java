package section7_PredefinedFunction_Function;

import java.util.function.Function;

public class Function_Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Swapnil"));
		System.out.println(f.apply("Swap:"));

	}

}
