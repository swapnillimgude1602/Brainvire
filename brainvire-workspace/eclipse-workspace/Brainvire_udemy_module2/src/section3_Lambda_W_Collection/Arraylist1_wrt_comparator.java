package section3_Lambda_W_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class myComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
//		if(o1>o2)
//			return -1;
//		else if(o1<o2)
//			return 1;
//		return 0;
		
		return (o1>o2)?-1:(o1<o2)?1:0;		//using ternary operator
	}
	
}
public class Arraylist1_wrt_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(15);
			
		//before sort
		System.out.println(al);
		
		// After sort
		Collections.sort(al, new myComparator());	
		System.out.println(al);
	}

}
