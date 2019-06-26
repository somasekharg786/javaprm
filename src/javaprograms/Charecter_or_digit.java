package javaprograms;

public class Charecter_or_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "somasekhar54646&*&#!";
				
		StringBuffer alpha=new StringBuffer(), character=new StringBuffer(),digits=new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i)))digits.append(s.charAt(i));
		else if(Character.isAlphabetic(s.charAt(i)))character.append(s.charAt(i));
		else
			alpha.append(s.charAt(i));
		
					
		}
		System.out.println(alpha);
		System.out.println(character);
		System.out.println(digits);

	}
}
