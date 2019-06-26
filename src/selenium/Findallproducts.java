package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findallproducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9908070469");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Somu@123");
		driver.findElement(By.xpath("//div[@class='_1avdGP']/button")).click();

		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		List<WebElement> products=driver.findElements(By.xpath("//div[starts-with(text(),'Apple iPhone')]"));
		
		 for(WebElement product:products) {

		        System.out.println(product.getText());      
		    }   
	}

}
