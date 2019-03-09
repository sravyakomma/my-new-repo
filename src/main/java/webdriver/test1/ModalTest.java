package webdriver.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
    			"C:/Users/sravya/Downloads/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://formy-project.herokuapp.com/modal");
    	WebElement modal = driver.findElement(By.id("modal-button"));
    	modal.click();
    	Thread.sleep(2000);
    	WebElement closeButton = driver.findElement(By.id("close-button"));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", closeButton);
    	//closeButton.click();
    	driver.quit();
	}

}
