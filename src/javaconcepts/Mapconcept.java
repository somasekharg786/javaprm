package javaconcepts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapconcept {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer,String> maps=new HashMap<Integer,String>();
		maps.put(1, "kashi viswanath");
		maps.put(2,"veshalakshi");
		maps.put(3,"Annapurna");
		
		System.out.println(maps);
		
		Set<Entry<Integer, String>> entries=maps.entrySet();
		System.out.print(entries);

	}

}
