package javaconcepts;

public class Methodoverloading {
	
	public void method1() {
		System.out.println("Hi how are you");
		
	}
	public void method1(int x,int y) {
		
		int z=x+y;
		System.out.println("Hi how are you  " +z);
	}
	public boolean method1(int x,int y,int z) {
		int i=x+y+z;
		System.out.println("Hi how are you  " +i);
		return false;
	}
	public int method1(float x,int y,float z) {
		float j=x+y+z;
		System.out.println("Hi how are you  " +j);
		return y;
	}
	public float method1(int x,float y,float z) {
		float k=x+y+z;
		System.out.println("Hi how are you  " +k);
		return k;
	}
	public double method1(int x,double y,float z) {
		
		double l=x+y+z;
		System.out.println("Hi how are you  ");
		return y;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading mm=new Methodoverloading();
		mm.method1();
		mm.method1(2, 3);
		mm.method1(2, 3, 4);
		mm.method1(6, 2233.6, 3434);
		mm.method1(646, 4646, 6464);
		mm.method1(2323, 33434, 43434);
		

	}

}
