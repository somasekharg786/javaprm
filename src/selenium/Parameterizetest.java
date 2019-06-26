package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Parameterizetest {
	
	WebDriver driver;
	
	@Test
	public void parameetertest( String url, String username) {
		
		
		 
		//System. setProperty("webdriver.chrome.driver", "");
		// driver=new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		 driver.get("https://in.yahoo.com/?p=us");
		 driver.findElement(By.xpath("//a[id=\"signinuh-\"]")).click();
		 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("somasekhar");
		 driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		 
		
		
	}

}
