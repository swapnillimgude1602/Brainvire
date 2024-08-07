	package section3_Lambda_W_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1_comparator_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(5);
		System.out.println("Before sort:"+al);
		Collections.sort(al,(i1,i2)->((i1>i2)?-1 : (i1<i2)?1 : 0));	//Using Lambda printing descending
		
		System.out.println("After sort desc:"+al);

		
		

	}

}
