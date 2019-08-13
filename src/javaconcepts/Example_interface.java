package javaconcepts;

public interface Example_interface {
	
	void show();
	default void show1() {
		System.out.println("Hi this is defalut method");
		
	}
	 static void show2() {
		System.out.println("this is static method ");
	}

}
