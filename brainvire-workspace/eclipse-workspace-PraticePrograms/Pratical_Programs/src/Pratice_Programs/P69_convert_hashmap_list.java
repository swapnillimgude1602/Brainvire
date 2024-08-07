package Pratice_Programs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P69_convert_hashmap_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "swap");
        map.put(2, "nil");
        map.put(3, "lim");
        map.put(4, "gude");
        
        List<Integer> keys = map.keySet().stream().collect(Collectors.toList());
        
        List<String> values = map.values().stream().collect(Collectors.toList());
         
        for(Integer i : keys) {
        	System.out.println("keys: "+i);
        }
        for(String s: values) {
        	System.out.println("Values: "+s);
        }
	}

}
