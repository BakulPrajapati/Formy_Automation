import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("02/05/2020");
		datePicker.sendKeys(Keys.RETURN);
		
		
		driver.quit();
		

		
	}

}
