package selenium_demo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class alert {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
			//driver.findElement(By.id("alertexamples")).click();
			//there is an alert which needs to be handled
			//Thread.sleep(4000);
			//Alert al = driver.switchTo().alert();
			//al.accept();
			
			//driver.findElement(By.id("confirmexample")).click();
			//again, there is an alert
			//Thread.sleep(3000);
			//driver.switchTo().alert().dismiss();
			
			driver.findElement(By.id("promptexample")).click();
			
			Thread.sleep(3000);
			driver.switchTo().alert().sendKeys("AJAY");
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			driver.quit();
			
			
			
		}
	

}
