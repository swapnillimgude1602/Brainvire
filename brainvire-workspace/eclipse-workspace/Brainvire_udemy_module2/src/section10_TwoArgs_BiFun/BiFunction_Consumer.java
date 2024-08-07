package section10_TwoArgs_BiFun;

import java.util.function.BiConsumer;

public class BiFunction_Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> bc = (s1,s2) -> System.out.println(s1+s2);
		bc.accept("Swap", "nil");
		
		BiConsumer<Integer, String> bc1 =(s1,s2) -> {
			
			if(s1>Integer.parseInt(s2))
				System.out.println("Greater");
			else System.out.println("smaller");
		};
		bc1.accept(12, "13");
		
		BiConsumer<String,Integer> bc2 = (s1,s2) -> System.out.println(s1+" "+s2);
		bc2.accept("Swap", 10);
	}

}
