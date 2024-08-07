package section9_PredefinedFunction_Supplier;

import java.util.function.Supplier;

public class Random_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier <String> s = () -> {
		String str[] = {"Swapnil","swap","mad","sahil","deva"};
		int x = (int) (Math.random()*4);
		return str[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());


	}

}
