package javaconcepts;

public class Constructoroverloading {
	
	Constructoroverloading(int x){
		System.out.println(x);
		
	}
Constructoroverloading(int x,int y){
		
	System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading cn=new Constructoroverloading(2);
		Constructoroverloading cn1= new Constructoroverloading(3,4);

	}

}
