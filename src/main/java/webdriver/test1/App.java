package webdriver.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver",
    			"C:/Users/sravya/Downloads/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://formy-project.herokuapp.com/autocomplete");
    	WebElement autoComplete = driver.findElement(By.id("autocomplete"));
    	autoComplete.sendKeys("3773 Chadbourne Road, Fairfield, CA, USA");
    	Thread.sleep(3000);
    	
    	WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
    	System.out.println(autoCompleteResult.isEnabled());
    	autoCompleteResult.click();
   
    	//Thread.sleep(10000);
    	driver.quit();
    }
}
