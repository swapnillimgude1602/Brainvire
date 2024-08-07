package section25_collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class my implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return 1;
		if(o1>o2)
			return -1;
		
		return 0;
	}
	
}
public class Priorityqueue_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue <Integer> pq = new PriorityQueue <>(new my());
		pq.add(10);
		pq.add(30);
		pq.add(3);
		pq.add(5);
		pq.add(14);
		
				
		pq.forEach((x)->System.out.println(x));
		System.out.println("Head(First Ele ) :"+pq.peek());	//retrieves 1st element
		


	}

}
