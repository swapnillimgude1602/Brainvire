package Pratice_Programs;

import java.util.HashSet;
import java.util.Set;

public class P143_Interate_set {

	public static void main(String args[]) {
		Set<String> str = new HashSet<String>();
		str.add("i");
		str.add("am");
		str.add("swapnil");
		str.add("limgude");
		
		System.out.println(str);
		str.stream().forEach(s->{
			System.out.println(s);
		});
		
	}
	
}
