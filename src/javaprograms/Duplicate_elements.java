package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String names[]= {"java","rama","seetha","rama","hanuma","seetha","hanuma"};
		 
		 for(int i=0;i<names.length;i++) {
			 for(int j=i+1;j<names.length;j++) {
				 if(names[i].equals(names[j])) {
					 System.out.println("the duplicate elements are   " +names[i]);
				 }
			 }
		 }
		   System.out.println("************************");
		   
		 Set<String> store=new HashSet<String>();
		 for(String name:names)
		 {
			if( store.add(name)==false) {
				System.out.println("the duplicate elment   " +name);
			}
		 }
		 
	}

}
