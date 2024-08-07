package Pratice_Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P80_SortMap_Values {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Swapnil", 5);
		unsortedMap.put("Madhuri", 2);
		unsortedMap.put("Dipali", 8);
		unsortedMap.put("Sameer", 3);

		System.out.println("Original Map: " + unsortedMap);
		Map<String, Integer> sortedMap = sortByValues(unsortedMap);
		System.out.println("Sorted Map By Values: " + sortedMap);
	}

	private static Map<String, Integer> sortByValues(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort(Comparator.comparing(Map.Entry::getValue));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
