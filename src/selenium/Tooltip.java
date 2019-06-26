package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement tootip=driver.findElement(By.xpath("//a[@title='Go to Facebook home']"));
		
		String actual=tootip.getAttribute("title");
		System.out.println(actual);
		
		String expected="Go to Facebook home";
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		driver.close();

	}

}
