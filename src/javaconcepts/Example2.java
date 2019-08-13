package javaconcepts;

public interface Example2 {
  public void method2();
  default public void method3() {
	  System.out.println("Hi this is method3");
  }
  
}
