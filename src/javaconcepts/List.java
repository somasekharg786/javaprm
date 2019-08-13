package javaconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=new ArrayList<String>();
		list.add("somasekhar");
		list.add("somasekhar123");
		list.add("sekharsoma");
		list.add("ganapuramsoma");
		list.add("sososo");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("ganapuramsoma");
		list2.add("sekharsoma");
		list2.add("somasekhar");
		
		list2.retainAll(list);
	for(String list1:list2) {
			
			System.out.println(list1);
			
		}
	/*	
		
		list.forEach(a ->{
			System.out.println(a);
		});
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			String y=itr.next();
			System.out.println(y);*/
		}
		
	}

































