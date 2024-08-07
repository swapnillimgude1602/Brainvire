package section25_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> al1 = new ArrayList<>();
		ArrayList <Integer> al2 = new ArrayList<>(List.of(10,20,30));
		al1.add(10);
		al1.add(0, 5);
		
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		System.out.println("contains"+al1.contains(10));	//checks for elements boolean
		System.out.println("get"+al1.get(3));	//retruns ele
		System.out.println("index"+al1.indexOf(10));	//returns index
		System.out.println("Indexof"+al1.lastIndexOf(10));	//checks from last and returns ele
		al1.set(1, 15);
		al1.remove(4);
		
		
		//System.out.println(al1);
		
		for (int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		
		for(Integer x: al1)
		{
			System.out.println(x);
		}
		
		ListIterator<Integer> it = al1.listIterator();	//Use to fetch elements in list bidirectionally
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}   

}
