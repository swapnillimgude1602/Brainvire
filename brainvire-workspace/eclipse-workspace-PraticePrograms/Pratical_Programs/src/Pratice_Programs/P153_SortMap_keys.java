package Pratice_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P153_SortMap_keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Dinesh", 4);
		unsortedMap.put("Swapnil", 1);
		unsortedMap.put("Madhuri", 2);
		unsortedMap.put("Akshay", 3);

		Map<String, Integer> sortedMap = new TreeMap<>(unsortedMap);

		System.out.println("Sorted Map by Keys:");
		System.out.println(sortedMap);
//		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
	}
}
