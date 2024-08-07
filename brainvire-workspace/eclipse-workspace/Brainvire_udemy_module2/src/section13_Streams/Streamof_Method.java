package section13_Streams;

import java.util.stream.Stream;

public class Streamof_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Processing Method - streamof()-
		 * We can also apply stream for group of values & for arrays. other than Collection.
		 * 
		 */
		
		System.out.println("--Group of values--");
		Stream<Integer> s = Stream.of(9,99,99,999,9999);
		s.forEach(System.out::println);
		
		System.out.println("--For Arrays--");
		Double d[] = {12.1,12.2,12.3,12.4,12.5};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);

	}

}
