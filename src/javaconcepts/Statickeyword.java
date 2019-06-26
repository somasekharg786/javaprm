package javaconcepts;

public class Statickeyword {
	static int z=3;
	static int y=4;
	int i=77;

	
	public static void method() {
		int x=1;
		int y=2;
		System.out.println(z);
		System.out.println(y);
				
	   
	}
	public  void method1() {
		
		System.out.println(z);
		method();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method();
		Statickeyword ss=new Statickeyword();
		
	    System.out.println(z);
	    System.out.println(y);

	}

}
