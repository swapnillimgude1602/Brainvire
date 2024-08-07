package section15_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCollection {
	public static void main(String args[]) {
	       //Queue<Integer> q = new LinkedList();
	       Queue<Integer> q = new ArrayDeque<Integer>();	//double ended queue
	       q.add(1);
	       q.add(2);
	       q.add(3);
	       q.add(4);
	       q.add(5);


	       while(!q.isEmpty()) {
	           System.out.println(q.peek());
	           q.remove();
	       }
	   }

}
