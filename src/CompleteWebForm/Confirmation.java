package CompleteWebForm;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirmation {
	
	public void waitForConfirmation(WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 10);

	WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

	String alertText = alert.getText();

	assertEquals("The form was successfully submitted!", alertText);
	
}
	}
