package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement e = driver.findElement(By.xpath("//select[@id='day']"));
		e.click();
		Select s = new Select(e);
		s.selectByValue("10");

		WebElement e1 = driver.findElement(By.xpath("//select[@id='month']"));
		e1.click();
		Select s1 = new Select(e1);
		s1.selectByValue("11");
		
		WebElement e2 = driver.findElement(By.xpath("//select[@id='year']"));
		e2.click();
		Select s2 = new Select(e1);
		s2.selectByValue("1994");

		

	}

}
