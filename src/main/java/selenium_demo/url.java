package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class url {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println(urls);
		System.out.println("Number of urls : "+urls.size());//.......................no. of urls
		
		for(WebElement abc : urls)
		{
			System.out.println("text is : "+ abc.getText());
			System.out.println("title is : "+ abc.getAttribute("title"));
		}
		
		driver.close();
	}
	
}


