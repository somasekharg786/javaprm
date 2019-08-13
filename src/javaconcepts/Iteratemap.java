package javaconcepts;

import java.util.HashMap;
import java.util.Map;

public class Iteratemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "swarnakarhnaBirava");
		map.put(2, "samahara Birava");
		map.put(3, "batukaBhirava");
		map.put(4, "Ruru kuru Birava");
		map.put(6, "SWARNAKARSHANA  Birava");
		map.put(7, "Bhesana  Birava");
		map.put(8, "unmatha Birava");
		map.put(9, "Krodha  Birava");
		
        
	
		
	//	for(Map.Entry<Integer, String> entries:map.entrySet())
     //   {
		  //  System.out.println(entries.getKey()+"  "+entries.getValue());	
	//	}
		
	//map.forEach((k,v) -> System.out.println(k+ " "+v));
		
		for(Map.Entry<Integer, String> entries:map.entrySet()) {
			System.out.println(entries.getKey()+" "+entries.getValue());
		}
	}
} 
