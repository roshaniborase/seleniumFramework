package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


/*
 * Select:
 * is a class used to handle dropdown with Select tag
 * Three methods:
 * select by Index
 * Select by value
 * select by text
 */


public class dropdown {
	public static void main(String[] args) {
		multiSelect();

	}
	public static void multiSelect()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement dropDown = driver.findElement(By.id("fruits"));
		
		Select obj = new Select(dropDown);
		obj.selectByIndex(1);
		obj.selectByValue("apple");
		obj.selectByVisibleText("Apple");
		//obj.deselectAll();
		driver.close();
	}
}


