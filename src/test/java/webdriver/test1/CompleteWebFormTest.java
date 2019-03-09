package webdriver.test1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteWebFormTest {

	@Test
	public void test() throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
		    			"C:/Users/sravya/Downloads/chromedriver_win32/chromedriver.exe");
		    	WebDriver driver = new ChromeDriver();
		    	driver.get("http://formy-project.herokuapp.com/form");
		    	
		    	WebElement firstName = driver.findElement(By.id("first-name"));
		    	firstName.sendKeys("Sravya");
		    	
		    	WebElement lastName = driver.findElement(By.id("last-name"));
		    	lastName.sendKeys("Komma");
		    	
		    	WebElement jobTitle = driver.findElement(By.id("job-title"));
		    	jobTitle.sendKeys("Automation Engineer");
		    	
		    	WebElement radioButton = driver.findElement(By.cssSelector("input[value='radio-button-2']"));
		    	radioButton.click();
		    	
		    	WebElement checkBox = driver.findElement(By.id("checkbox-2"));
		    	checkBox.click();
		    	
		    	WebElement dropDown = driver.findElement(By.id("select-menu"));
		    	dropDown.click();
		    	
		    	WebElement dropDownItem = driver.findElement(By.cssSelector("option[value='2']"));
		    	dropDownItem.click();
		    	
		    	WebElement datePicker = driver.findElement(By.id("datepicker"));
		    	datePicker.sendKeys("11/08/1986");
		    	datePicker.sendKeys(Keys.RETURN);

		    	WebElement submit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
		    	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    	Thread.sleep(3000);
		    	submit.click();
		    	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    	
		    	WebDriverWait wait = new WebDriverWait(driver, 10);
		    	WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
		    //	WebElement success = driver.findElement(By.cssSelector(".alert.alert-success"));
		    	assertEquals("The form was successfully submitted!",alert.getText());
		    	driver.quit();
	}

}
