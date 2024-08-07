package section7_PredefinedFunction_Function;

import java.util.function.Function;

public class Function_interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(10));
		System.out.println(f.apply(5));

	}

}
