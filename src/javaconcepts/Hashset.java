package javaconcepts;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> hs=new HashSet<String>();
	
	hs.add("somasekhar");
	hs.add("rama");
	hs.add("seetha");
	hs.add("laxman");
	hs.add("hanuman");
	
      Iterator<String> it=hs.iterator();
      while(it.hasNext()) {
    	  
    	  System.out.println(it.next());
      }
	}

}
