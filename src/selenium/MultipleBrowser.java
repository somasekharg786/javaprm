package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleBrowser {
	@Test(priority=1)
	public void cromebrowser() {
		
		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}
	@Test(priority=0)
	public void firefoxbrowser() {
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}

	
}
