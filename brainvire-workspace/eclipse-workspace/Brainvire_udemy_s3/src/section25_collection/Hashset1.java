package section25_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<>(50, 0.25f);
		HashSet<Integer> hs1 = new HashSet<>(List.of(50,60,50));
 		hs.add(18);
		hs.add(30);
		hs.add(40);
		hs.add(40);
		hs.addAll(hs1);
		hs.remove(30);
		System.out.println(hs.contains(60));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());


		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * no duplicates allowed only unique unordered.
		 * stores element based on reminder 
		 * Loading factor - 75% rest 25% blankspaces
		 * open addressing - same ele next bucket 
		 * chaining - same ele same bucket (node)
		 */

	}

}
