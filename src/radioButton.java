import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement button1 = driver.findElement(By.id("radio-button-1"));
		button1.click();
		
		WebElement button2 = driver.findElement(By.cssSelector("input[value= 'option2']"));
		button2.click();
		
		WebElement button3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		button3.click();
		
		driver.quit();
	}

}
