package javaprograms;

public class Fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10,t1=0,t2=1;
		
			
		for(int i=0;i<n;i++) {
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
	}

}
