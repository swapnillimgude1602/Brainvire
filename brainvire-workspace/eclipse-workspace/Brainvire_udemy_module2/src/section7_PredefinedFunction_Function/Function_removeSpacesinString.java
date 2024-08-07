package section7_PredefinedFunction_Function;

import java.util.function.Function;
public class Function_removeSpacesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is open Source Language";
		
		Function<String,String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply(str));

	}

}
