package javaprograms;

public class Count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" Hi somasekhar How r u";
		int count=0;
         
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
				
				count++;
				
			}
		}

System.out.println(count);
	}

}
