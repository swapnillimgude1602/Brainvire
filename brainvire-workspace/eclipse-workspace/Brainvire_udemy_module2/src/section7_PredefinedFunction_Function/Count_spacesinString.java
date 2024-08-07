package section7_PredefinedFunction_Function;

import java.util.function.Function;

public class Count_spacesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is open Source Language";
		
		Function<String,Integer> f = s ->s.length()-s.replaceAll(" ", "").length();
		System.out.println(f.apply(str));


	}

}
