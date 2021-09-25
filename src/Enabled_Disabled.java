import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/enabled");
		
		WebElement disabled = driver.findElement(By.id("disabledInput"));
		disabled.isEnabled();
		disabled.click();
		
		WebElement enabled = driver.findElement(By.id("input"));
		enabled.isEnabled();
		enabled.sendKeys("Testing website");
		enabled.sendKeys(Keys.RETURN);
		
		
		driver.quit();
	}

}
