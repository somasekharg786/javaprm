package javaconcepts;

import org.testng.annotations.Test;

public class Grouptest {
	
@Test(groups="regresion")	
public void test1() {
	System.out.println("this is test1");
}
@Test(groups="smoke")
public void test2() {
	System.out.println("this is test2");
}
@Test(groups="smoke")
public void test3() {
	System.out.println("this is test3");
}
@Test(groups="regresion")
public void test4() {
	System.out.println("this is test4");
}

}
