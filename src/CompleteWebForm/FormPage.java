package CompleteWebForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {


public void FormPage (WebDriver driver){
	

	WebElement firstName = driver.findElement(By.id("first-name"));
	firstName.sendKeys("Test");
	
	WebElement lastName = driver.findElement(By.id("last-name"));
	lastName.sendKeys("Form");
	
	WebElement jobTitle = driver.findElement(By.id("job-title"));
	jobTitle.sendKeys("Quality Assurance");
	
	WebElement education = driver.findElement(By.id("radio-button-2"));
	education.click();
	
	WebElement gender = driver.findElement(By.id("checkbox-1"));
	gender.click();
	
	WebElement experience = driver.findElement(By.id("select-menu"));
	experience.click();
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]"));
	dropdown.click();
	
	WebElement datepicker = driver.findElement(By.id("datepicker"));
	datepicker.sendKeys("02/02/2020");
	
	WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
	submitButton.click();
}
}

