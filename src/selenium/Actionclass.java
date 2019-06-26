package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actionclass {
	
	public static void main(String[] args) {
		
		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement eleme=driver.findElement(By.xpath("//input[@name='cusid']"));
		eleme.sendKeys("somasekhar");
		WebElement eleme1=driver.findElement(By.xpath("//input[@value='Submit']"));
		eleme1.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
	}
	
	

}
