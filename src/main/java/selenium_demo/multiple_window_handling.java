package selenium_demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiple_window_handling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//at this point there is only 1 window present
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent Window ==> " + driver.getTitle());
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		
		//at this point there are 2 windows present
		Set<String> windows = driver.getWindowHandles();
		//System.out.println("Child Window ==> " + driver.getTitle());
		//System.out.println(driver.getWindowHandle());
		String childWindowId = null;
		
		 Iterator<String> it = windows.iterator();
		 it.next();
		 childWindowId= it.next();
		 
		 System.out.println("Parent Window Id ==> "+parentWindowId);
		 System.out.println("Child Window Id ==> "+childWindowId);
		 
		 driver.switchTo().window(childWindowId);
		 System.out.println("Child Window Title "+driver.getTitle());
		 
		 driver.switchTo().window(parentWindowId);
		 System.out.println("Parent Window ==> " + driver.getTitle());
		 
		 
		 //driver.close(); //will close the window currently pointed by the driver
		driver.quit(); //will close all the windows
		
		
	
		
		
		
	}
}
