package section9_PredefinedFunction_Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
