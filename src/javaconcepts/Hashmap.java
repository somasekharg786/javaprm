package javaconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "shiva");
		hm.put(2, "parvathi");
		hm.put(3, "ganapathi");
		hm.put(4, "karthikeya");
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
		Map.Entry	mp=(Map.Entry) it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	
		}
	for(Integer map: hm.keySet()) {
		System.out.println(hm.get(map));
		
	}
	
	}
	
	
	

}
