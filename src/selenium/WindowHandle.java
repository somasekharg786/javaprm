package selenium;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System. setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get(" http://demo.guru99.com/popup.php ");

		
		WebElement eleme1=driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		eleme1.click();
		
		
		String mainwindow=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		
		java.util.Iterator<String> it=s1.iterator();
		while(it.hasNext()) {
			String childwindow=it.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("somaserkhar");//
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();	
			}
		}
		
		 driver.switchTo().window(mainwindow);	
	}

}
