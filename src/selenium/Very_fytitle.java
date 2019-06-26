package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Very_fytitle {
public static void main(String[] args) {
		
		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		String actual=driver.getTitle();
		String expected="Automation Testing Practice";
		Assert.assertEquals(actual, expected);
		driver.close();
		System.out.println(actual);
		System.out.println(expected);
		
		
		
		
	}
	
	

}
