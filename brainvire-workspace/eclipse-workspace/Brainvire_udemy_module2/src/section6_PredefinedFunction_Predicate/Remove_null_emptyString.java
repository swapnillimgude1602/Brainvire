package section6_PredefinedFunction_Predicate;

import java.util.ArrayList;

public class Remove_null_emptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"swapnil","","Sahil","mady",null,"harsh",null};
		
		Predicate<String> p = s -> s!=null && s.length()!=0;
		ArrayList<String> al = new ArrayList<>();
		for(String s: arr)
		{
			if(p.test(s))
			{
				al.add(s);
			}
		}
		System.out.println("Valid string"+al);


	}

}
