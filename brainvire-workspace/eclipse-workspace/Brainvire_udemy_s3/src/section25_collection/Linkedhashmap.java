package section25_collection;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(1, "abc");
		lhm.put(2, "pqr");
		lhm.put(3, "xyz");

		System.out.println(lhm);
		System.out.println("Getting value for key : " + lhm.get(2));

		System.out.println("Size of the map: " + lhm.size());

		System.out.println("Is map empty? " + lhm.isEmpty());

		System.out.println("Contains key  " + lhm.containsKey(3));

		System.out.println("delete element 'one': " + lhm.remove(1));
		System.out.println(lhm);


	}

}
