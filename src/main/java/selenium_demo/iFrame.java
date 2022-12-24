package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Webdriver cannot directly access the elements within the frame
 * switch to the frame
 * 
 * switchtoframe methods
 * 1. by index
 * 2. by id or name
 * 3. by webelement
 * 
 */

public class iFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tinymce");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("hii");
	
		driver.switchTo().parentFrame();
		driver.quit();
		

		
	}
}
