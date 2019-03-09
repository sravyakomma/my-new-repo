package webdriver.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
    			"C:/Users/sravya/Downloads/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://formy-project.herokuapp.com/switch-window");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
    	newTabButton.click();
    	Thread.sleep(2000);
    	String originalHandle = driver.getWindowHandle();
    	Thread.sleep(2000);
    	
    	/*for(String handle:driver.getWindowHandles()){
    		driver.switchTo().window(handle);
    	}*/
    	
    	//Thread.sleep(3000);
    	driver.switchTo().window(originalHandle);
    	Thread.sleep(3000);
    	WebElement alert = driver.findElement(By.id("alert-button"));
    	alert.click();
    	Thread.sleep(3000);
    	driver.switchTo().alert().accept();
    	Thread.sleep(3000);
    	driver.quit();

	}

}
