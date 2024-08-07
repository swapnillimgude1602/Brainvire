package section25_collection;

import java.util.BitSet;

public class bitset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*creates array of bit represnted by boolean value	
		 * default false 0 clear()
		 * 
		 * 
		*/
		BitSet bs = new BitSet();
		bs.set(0);
		bs.set(2);
		bs.set(4);
		bs.set(6);
		bs.set(8);
		System.out.println(bs);

		BitSet bs1 = new BitSet();
		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(3);
		bs1.set(4);
		bs1.set(5);
		bs1.set(6);
		bs1.set(7);
		bs1.set(8);
		
		System.out.println(bs1);

		//bs.and(bs1); // fetch similar data
		//bs.or(bs1);// fetch one elements is available or not. so it print that elements which is write first or which is first object

		bs1.flip(0, bs1.length());
		System.out.println(bs1);

		bs.flip(0, bs.length());
		System.out.println(bs);

	}

}
