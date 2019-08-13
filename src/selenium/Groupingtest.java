

package selenium;

import org.testng.annotations.Test;

public class Groupingtest {
	
	@Test (groups = { "rigression"})	
	public void test1() {
		System.out.println("this regression test case");
	}
	@Test (groups = { "rigression"})	
	public void test2() {
		System.out.println("this regression test case");
	}
	@Test (groups = { "smoketest"})	
	public void test3() {
		System.out.println("this smoke test case");
	}
	@Test (groups = { "smoketest" })	
	public void test4() {
		System.out.println("this smoke test case");
	}
	@Test (groups = { "sanitytest" })	
	public void test5() {
		System.out.println("this sanity test case");
	}
	@Test (groups = { "sanitytest" })	
	public void test6() {
		System.out.println("this sanity test case");
	}
	

}
