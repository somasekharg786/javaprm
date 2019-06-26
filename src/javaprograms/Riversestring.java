package javaprograms;

public class Riversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="somasekhar",riverse="";
		
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			riverse=riverse+s1.charAt(i);
			
		}
		
		System.out.println(riverse);

	}

}
