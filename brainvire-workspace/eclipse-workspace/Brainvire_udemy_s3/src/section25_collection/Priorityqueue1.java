package section25_collection;
import java.util.PriorityQueue;
public class Priorityqueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	PriorityQueue <Integer> pq = new PriorityQueue <>();
	pq.add(10);
	pq.add(30);
	pq.add(3);
	pq.add(5);
	pq.add(14);
	
	//System.out.println(pq);
	
	pq.forEach((x)->System.out.println(x));
	System.out.println("Head(First Ele :)"+pq.peek());	//retrieves 1st element
	//System.out.println(pq.poll());	//retrieves and removes 1st ele
	pq.forEach((x)->System.out.println(x));


	
	}

}
