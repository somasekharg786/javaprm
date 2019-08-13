package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parlleltest {
	
	WebDriver driver=null;
      @Test
	public void test1() {
    	   
    	  System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
    	  driver=new FirefoxDriver();
  		driver.get("https://www.youtube.com/watch?v=1Y6knVutUsI");
  		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	  System.out.println("hi this is test1  ! " +Thread.currentThread().getId());
		
	}   @Test
      public void test2() {
		 
		
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	  System.out.println("Hi this is the test2  ! " +Thread.currentThread().getId());
      }
}
