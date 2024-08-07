package section6_PredefinedFunction_Predicate;

public class Predicate_StringL_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate <String> p = s -> s.length()>10;
		System.out.println(p.test("Swap"));		//check for length greater than 10
		System.out.println(p.test("Swapnilswapnil"));

		

	}

}
