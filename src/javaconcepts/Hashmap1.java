package javaconcepts;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "somasekhar");
		hs.put(2,"kalabarava");
		hs.put(3, "ganapuarm");
		hs.put(4, "sekhar");
		
		for(Map.Entry m:hs.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		
	}

}
