package section25_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
	        
	        lhs.add("abc");
	        lhs.add("pqr");
	        lhs.add("xyz");
	        lhs.add("swap");
	        lhs.add("nil");
	        System.out.println(lhs.isEmpty());
	        System.out.println(lhs.size());
	      
	        
	        Iterator<String> itr=lhs.iterator();
	        
	        while(itr.hasNext())
	        {
	            System.out.println(itr.next());
	        }

	}

}
