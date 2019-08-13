package javaprograms;

import java.util.HashMap;

public class Countabc {
	
	public static void characterCount(String x) {
		HashMap<Character, Integer> has=new HashMap<Character, Integer>();
		
		char[] ch=x.toCharArray();
		
		for(char c:ch) {
			if(has.containsKey(c)) {
				has.put(c, has.get(c)+1);
			}else {
				has.put(c, 1);
			}
		}
		System.out.println(has);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
characterCount("HI somasekhar How are u");
	}

}
