package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class js_execution {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,1000)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement target = driver.findElement(By.xpath(null));
		js.executeScript("arguments[0].scrollIntoView()", target);
		
	}
}
