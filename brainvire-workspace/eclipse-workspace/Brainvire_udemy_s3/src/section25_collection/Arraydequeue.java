package section25_collection;

import java.util.ArrayDeque;
public class Arraydequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq=new ArrayDeque<>();
        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
       // dq.pollFirst();
        
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        System.out.println(dq);
        dq.forEach((x)->System.out.println(x));
        

	}

}
