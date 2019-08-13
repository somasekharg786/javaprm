package javaprograms;

public class Manuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hi how are u somasekhar";
		String s2="Hi how are u Somasekhar";
		//charAt
		System.out.println(" the fifth character  " +s1.charAt(5));
		//endswith
		System.out.println(s1.endsWith("a"));
		//startwith
		System.out.println(s1.startsWith("H"));
		
		//compareto
		System.out.println(s1.compareTo(s2));
		//equals and equalignorence case
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//contains
		
		System.out.println(s1.contains("how"));
		
		//indexof
		System.out.println(s1.indexOf("h"));
		
		//isEmty
		System.out.println("the string conts "+s1.isEmpty());
		
		//tocharArray
		System.out.println(s1.toCharArray());
		
		//replace
		System.out.println(s1.replace(" ", "f"));
		
		//toUppercase
		System.out.println(s1.toUpperCase());
       //trim
		String s4="  hooookehk";
		System.out.println(s4.trim());
		
		String s5=" hi how are where ru";
		String s6[]=s5.split(" ");
		for(int i=0;i<s6.length;i++) {
			
			System.out.println(s6[i]);
		}
		
		
		//concate
		
		String s8="HELLO";
		String s7="somu";
		System.out.println(s8.concat(s7).concat(" where r us" ).concat("Bangalore"));
		
		int x=989879;
		
		String s9=String.valueOf(x);
		System.out.println(s9);
		
		//convert char to string
		char ch[]= {'a','b','c'};
		String s10=String.valueOf(ch);
		System.out.println(s10);
		
		
		
		
		
		
	
 
	}

}
