package section25_collection;

import java.util.PriorityQueue;

public class Priorityqueue_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue <String> pq = new PriorityQueue<>();
		pq.add("abc");
		pq.add("pqr");
		pq.add("xyz");
		
		//System.out.println(pq);
		
		pq.forEach((x)->System.out.println(x));
		System.out.println("1st ele :"+pq.peek());
		pq.poll();	//removes 1st element
		pq.forEach((x)->System.out.println(x));
		
		pq.remove();	//removes 1st element
		pq.forEach((x)->System.out.println(x));
		
		System.out.println("xyz  " + pq.contains("xyz"));
        System.out.println("Size : " + pq.size());
        System.out.println("Is the queue empty " + pq.isEmpty());
        
        pq.clear();	//removes all ele





		
		
		
	}

}
