package section6_PredefinedFunction_Predicate;

public class Predicate_nameStartWith_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"swapnil","Sahil","mady","harsh"};
		Predicate<String> startwith = s -> s.charAt(0)=='s';
		
		for(String s :arr)
		{
			System.out.println(startwith.test(s));
		}

	}

}
