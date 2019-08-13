package javaprograms;

public class RiverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=12345;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10; //5  54  543 5432  54321
			num=num/10;//1234 123  12 1  
		}
		System.out.println(rev);

	}

}
