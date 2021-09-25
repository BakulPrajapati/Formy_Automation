import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/buttons");

		WebElement primaryButton = driver.findElement(By.className("btn-primary"));
		primaryButton.click();

		WebElement successButton = driver.findElement(By.className("btn-success"));
		successButton.click();

		WebElement infoButton = driver.findElement(By.className("btn-info"));
		infoButton.click();

		WebElement warningButton = driver.findElement(By.className("btn-warning"));
		warningButton.click();

		WebElement dangerButton = driver.findElement(By.className("btn-danger"));
		dangerButton.click();

		WebElement linkButton = driver.findElement(By.className("btn-link"));
		linkButton.click();

		WebElement leftButton = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
		leftButton.click();

		WebElement middleButton = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
		middleButton.click();

		WebElement rightButton = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
		rightButton.click();

		WebElement Button_1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
		Button_1.click();

		WebElement Button_2 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]"));
		Button_2.click();

		WebElement dropdownButton = driver.findElement(By.id("btnGroupDrop1"));
		dropdownButton.click();

		WebElement dropdownLink1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
		dropdownLink1.click();

		//WebElement dropdownLink2 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[2]"));
		//dropdownLink2.click();

		driver.quit();
	}

}
