package section25_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(30);
		ts.add(50);
		ts.add(70);
		ts.add(80);

		System.out.println(ts.contains(90)); // checks for given number
		System.out.println(ts.ceiling(55)); // gives highest closest Value
		System.out.println(ts.headSet(30)); // returns element less than 30
		System.out.println(ts.tailSet(50)); // returns element greater than 50 including itself
		System.out.println(ts.lower(30)); // return strict lower elemnt
		System.out.println(ts.higher(60)); // return higher elemnt
		System.out.println(ts.subSet(20, 70)); // return ele btwn given range
		
		System.out.println(ts.pollFirst()); // retrieves and removes the first lowest element, or returns null if this TreeSet is empty.
											
		System.out.println(ts.pollLast()); // returns retrieves and removes the last highest element, or returns null if this Treeset is empty.
											
		System.out.println(ts.isEmpty()); // checks for empty set

		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1 = (TreeSet) ts.clone(); // clones into another treeset
		System.out.println(ts1);

		System.out.println("class " + ts.getClass());

		System.out.println(ts.floor(80));

		System.out.println(ts.tailSet(30, true));// after the limits elements

		System.out.println("Displaying treeset");
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
