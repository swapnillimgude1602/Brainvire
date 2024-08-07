package section25_collection;

import java.util.ArrayDeque;

public class Arraydequeue_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Character> dq=new ArrayDeque<>();
        
		dq.addFirst('z');	
        dq.offerLast('a');
        dq.offerLast('z');
        dq.offerLast('b');
        dq.offerLast('q');
        
        dq.pollFirst();		
        
        dq.offerLast('t');
        dq.offerLast('s');
        dq.offerLast('g');
        dq.offerLast('q');
       // dq.clear();
        
        System.out.println(dq);
        
        dq.forEach((x)-> System.out.println(x));

	}

}
