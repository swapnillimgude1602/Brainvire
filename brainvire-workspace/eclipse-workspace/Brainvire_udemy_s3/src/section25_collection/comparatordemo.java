package section25_collection;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1 < i2)
			return 1;
		if (i1 > i2)
			return -1; // low prio low val & high prio high val
		return 0;
	}
}

public class comparatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

		Arrays.sort(a,new My());	//called here desc

		for (Integer x : a)
			System.out.print(x);

	}

}
