package selenium_demo;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class webTable {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			System.out.println("Row Count ==> " + rows.size());
			for (WebElement row : rows) {
				List<WebElement> cols = row.findElements(By.tagName("td"));
				for (WebElement col : cols) {
					System.out.println(col.getText());
				}
			}
			driver.close();
		}
	}


