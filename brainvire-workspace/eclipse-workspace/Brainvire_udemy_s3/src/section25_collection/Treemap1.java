package section25_collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> trmp = new TreeMap<>();
		trmp.put(0, "A");
		trmp.put(1, "B");
		trmp.put(2, "C");
		trmp.put(3, "D");
		trmp.put(4, "E");
		trmp.put(5, "F");

		Entry<Integer, String> e = trmp.firstEntry(); 			// its fetch the entry data it means first number key and element

		System.out.println(e.getKey() + " " + e.getValue()); 	// print first key and value
		System.out.println(trmp.ceilingEntry(4));				// it will print the equal value of greater value of mentioned key
		System.out.println(trmp); 								// print all the elements of the tree map
		System.out.println(trmp.ceilingKey(4));					// its print only key which is greater and equal
		System.out.println(trmp.containsKey(5));				// check availability
		System.out.println(trmp.floorEntry(4));					// print less or equal
		System.out.println(trmp.floorKey(4)); 					// print less then or equal key
		System.out.println(trmp.descendingKeySet()); 			// print descending order
		System.out.println(trmp.descendingMap());				// print full map means key and value both
		System.out.println(trmp.get(5));						// get value
		System.out.println(trmp.headMap(2));					// print top map but less than this key(key and value)
		System.out.println(trmp.headMap(2, true));				// print top map with mentioned key
		System.out.println(trmp.keySet());						// print all the keys
		System.out.println(trmp.higherEntry(4));				// print next of mentioned with key and value
		System.out.println(trmp.higherKey(4));					// print next key
		System.out.println(trmp.isEmpty());						// check is empty or not
		System.out.println(trmp.lastEntry());					// print last entry
		System.out.println(trmp.lastKey());						// print last key
		System.out.println(trmp.lowerEntry(4));					// print previous key and value
		System.out.println(trmp.lowerKey(4));					// print previous key only
		System.out.println(trmp.replace(3, "abc"));
		System.out.println(trmp.size());
		System.out.println(trmp.subMap(1, 3));					// print between 1 to 3 means 3 is not include
		System.out.println(trmp.tailMap(2));					// print map of 2 to till last
		System.out.println(trmp.tailMap(3, true));				// same
		System.out.println(trmp.values());						// print only values


	}

}
