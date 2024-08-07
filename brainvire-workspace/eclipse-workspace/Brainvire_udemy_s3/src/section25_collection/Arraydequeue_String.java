package section25_collection;

import java.util.ArrayDeque;

public class Arraydequeue_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> dq=new ArrayDeque<>();
        
        dq.offerLast("abc");
        dq.offerLast("def");
        dq.offerLast("ghi");
        dq.offerLast("jkl");
        
        dq.pollFirst();	//deletes the first.
        
        dq.offerLast("mno");
        dq.offerLast("pqr");
        dq.offerLast("stu");
        dq.offerLast("vwxyz");
        System.out.println(dq);
        dq.forEach((x)->System.out.println(x));
        

	}

}
