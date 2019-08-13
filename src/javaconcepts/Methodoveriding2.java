package javaconcepts;

public class Methodoveriding2 extends Methodoveriding {
	public void method1() {
		System.out.println("this is method1 of second class");
	}
	public void method2() {
		System.out.println("this is method2 of second class");
	}
	public static void main(String[] args) {
		
		Methodoveriding methodoveriding=new Methodoveriding();
		
		methodoveriding.method1();
		methodoveriding.method2();
		
		
		
		
		
	}
	

}
