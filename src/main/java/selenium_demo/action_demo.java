package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_demo{

	/*
	 * Actions
	 * class used for interacting keyboard and mouse events
	 * 
	 */
	public static void main(String[] args) {
		//scrollToElement();
		//keyBoard();
		hover();
	}
	
	public static void scrollToElement() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Plants & planters for your home & garden']"))).perform();
	}
	
	public static void keyBoard() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		//act.contextClick();
		act.click(username).keyDown(Keys.SHIFT).sendKeys("testemail@gmail.com").keyUp(Keys.SHIFT).perform();
		act.contextClick(driver.findElement(By.name("login"))).perform();
		
	}
	
	public static void hover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement menu = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).perform();
		//drag and drop
	}
}
