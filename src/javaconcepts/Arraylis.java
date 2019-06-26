package javaconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("Somasekhar");
		aa.add("Ganesha");
		aa.add("Rama");
		aa.add("seetha");
		System.out.println(aa);
		aa.add(4, "Laxman");
		System.out.println(aa);
		System.out.println(aa.contains("Rama"));
		System.out.println(aa.get(3));
		ArrayList<String> aaa = new ArrayList<String>();
		aaa.add("vishala");
		aaa.add("maheswari");
		aa.addAll(aaa);

		Iterator ite = aa.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		for( String s:aa) {
			
			System.out.println(s);
		}
		
		
	}

}