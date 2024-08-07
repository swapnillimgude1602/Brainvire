package section3_Lambda_W_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>((i1,i2)->((i1>i2)?-1 : (i1<i2)?1 : 0));
		
		ts.add(5);
		ts.add(30);
		ts.add(20);
		ts.add(35);
		ts.add(15);
		ts.add(25);
		
		Iterator<Integer> it = ts.iterator();	//Use to fetch elements in list
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

}
