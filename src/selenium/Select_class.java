package selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select s=new Select(driver.findElement(By.xpath("//select[@name='speed']")));
		//s.selectByVisibleText("Slow");
		
		java.util.List<WebElement> list=s.getOptions();
		int size=list.size();
		for(int i=0;i<size;i++) {
			String s1=list.get(i).getText();
			System.out.println(s1);
			if(s1.equalsIgnoreCase("Fast")) {
				s.selectByIndex(i);
			}
		}
		
		

	}

}
