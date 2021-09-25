import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
		fileUpload.sendKeys("testFile.txt");
		
		WebElement reset = driver.findElement(By.className("btn-reset"));
		reset.click();
		
		driver.quit();
	}

}
