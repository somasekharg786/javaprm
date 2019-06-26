package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sighnup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.switchTo().frame("frame-one1434677811");
		
	WebElement red=	driver.findElement(By.xpath("//input[@value='red']"));
		
		driver.findElement(By.xpath("//input[@value='yellow']")).click();
		
		driver.findElement(By.xpath("//input[@value='blue']")).click();
		
		driver.findElement(By.xpath("//input[@value='orange']")).click();
		
		driver.findElement(By.xpath("//input[@value='green']")).click();
		
		if(!red.isSelected()) {
			red.click();
			
		}
		

	}

}
