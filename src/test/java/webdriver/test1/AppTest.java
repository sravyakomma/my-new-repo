package webdriver.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws InterruptedException 
     */
    public void testApp() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver",
    			"C:/Users/sravya/Downloads/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://school.apple.com/");
    	System.out.println("stttttttttttttttttttttt");
    	System.out.println("before wait done");
    	//Thread.sleep(3000);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	System.out.println("wait done");

    	WebElement frame = driver.findElement(By.id("aid-auth-widget-iFrame"));
    	System.out.println("aaaaaaaaaaa");
    	driver.switchTo().frame(frame);
    	//WebElement webElement = chromeDriver.findElement(By.className("auth-container"));
    	System.out.println("bbbbbbbbbbbbb");
    	
    	WebElement webElement = driver.findElement(By.id("account_name_text_field"));
    	//Actions actions = new Actions(driver);
    	//actions.moveToElement(webElement);
    	webElement.sendKeys("sravyainala.16@gmail.com");
    	//webElement.submit();
    	System.out.println("ccccccccccccc");
    	//boolean isEnabled = webElement.isEnabled();
    	//System.out.println(isEnabled);
    	
    	driver.quit();
        //assertTrue( true );
    }
    
    
}
