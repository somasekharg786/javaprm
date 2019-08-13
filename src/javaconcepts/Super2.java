package javaconcepts;

public class Super2 extends Super1{
	
	public void method2() {
		String name="somasekhar";
		System.out.println(name);
		super.method1();
	}

	public static void main(String[] args) {
		
		Super2 s=new Super2();
		s.method2();
	
	}

}
