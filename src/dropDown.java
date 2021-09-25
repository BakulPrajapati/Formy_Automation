import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdownbutton = driver.findElement(By.id("dropdownMenuButton"));
		dropdownbutton.click();
		
		WebElement element = driver.findElement(By.id("autocomplete"));
		element.click();
		
		driver.quit();
		
	}

}
