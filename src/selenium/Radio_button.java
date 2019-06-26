package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().frame("frame-one1434677811");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		
		WebElement radio1=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		
		WebElement radio2=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']"));
		
		//RESULT_RadioButton-7_1
		radio2.click();
		if(radio1.isSelected()) {
			System.out.println("the male button is selected");
			
		}else {
         System.out.println("the male button*****elected");
			
		}
		radio1.click();
		if(!radio1.isSelected()) {
			System.out.println("the male radio button not seleceted");
		}
	//river.close();
		
	}

}
