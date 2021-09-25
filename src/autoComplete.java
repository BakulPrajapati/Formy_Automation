import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/autocomplete");
	
	WebElement autoComplete=  driver.findElement(By.id("autocomplete"));
	autoComplete.sendKeys("16 Deerfield");
	Thread.sleep(1000);
	
	WebElement selectAddress =driver.findElement(By.className("pac-item"));
	selectAddress.click();
	
	
	driver.quit();
	}

}
