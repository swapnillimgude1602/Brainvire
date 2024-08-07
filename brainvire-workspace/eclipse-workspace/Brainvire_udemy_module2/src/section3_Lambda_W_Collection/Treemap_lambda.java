package section3_Lambda_W_Collection;

import java.util.TreeMap;

public class Treemap_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>((i1, i2) -> ((i1 > i2) ? -1 : (i1 < i2) ? 1 : 0));
			
		tm.put(5, "swap");
		tm.put(50, "swap");
		tm.put(15, "swap");
		tm.put(55, "swap");
		tm.put(52, "swap");

		System.out.println(tm);
		
		//natural sorting order ascending
		//customized sorting using lambda for descending

	}

}
