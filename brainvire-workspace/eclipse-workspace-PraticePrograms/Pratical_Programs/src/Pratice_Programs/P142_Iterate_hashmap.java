package Pratice_Programs;

import java.util.HashMap;

public class P142_Iterate_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Swapnil", 1);
		hm.put("Maruti", 2);
		hm.put("Limgude",3);

		hm.forEach((v, k) -> System.out.println("Value: " + v + " : " + "Key: " + k));

	}

}
