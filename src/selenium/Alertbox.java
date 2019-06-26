package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	
	    Alert alert=driver.switchTo().alert();
		alert.accept();
				
		
	}

}
