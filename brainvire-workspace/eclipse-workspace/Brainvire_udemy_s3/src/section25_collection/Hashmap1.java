package section25_collection;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("A",1);
		hm.put("B",2);
		hm.put("C",3);
		hm.put("D",4);
        hm.put("E",5);
        System.out.println(hm);
        System.out.println(hm.containsKey("E"));
        System.out.println(hm.remove("E"));
        System.out.println(hm);
        System.out.println(hm.containsValue(5));
        System.out.println(hm.get("A"));
        System.out.println(hm.size());
        System.out.println(hm.entrySet());
        
	}

}
