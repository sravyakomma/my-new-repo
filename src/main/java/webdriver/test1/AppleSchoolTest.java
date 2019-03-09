package webdriver.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleSchoolTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
    			"C:/Users/sravya/Downloads/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://school.apple.com/");
    	Thread.sleep(3000);
    	
    	WebElement frame = driver.findElement(By.id("aid-auth-widget-iFrame"));
    	driver.switchTo().frame(frame);
//    	chromeDriver.switchTo().frame("aid-auth-widget-iFrame");
    	//WebElement webElement = chromeDriver.findElement(By.className("auth-container"));
    	//chromeDriver.wait(10000);
    	WebElement webElement = driver.findElement(By.id("account_name_text_field"));
    	webElement.sendKeys("sravyainala.16@gmail.com");
    	driver.switchTo().parentFrame();
    	WebElement footer = driver.findElement(By.cssSelector(".base-button.terms-and-conditions-button.cw-button >.title"));
    	System.out.println("found footer bar");
    	footer.click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-footer >.modal-footer-button-container span:nth-child(2) >.button-wrapper >.cw-button")));
    	WebElement downloadButton = driver.findElement(By.cssSelector(".modal-footer >.modal-footer-button-container span:nth-child(2) >.button-wrapper >.cw-button"));
    	
    	System.out.println("found download button"+downloadButton.getText());
    	Thread.sleep(5000);
    	downloadButton.click();;
    	System.out.println(downloadButton.isEnabled());
    	Thread.sleep(5000);
    	//webElement.submit();
    	//boolean isEnabled = webElement.isEnabled();
    	//System.out.println(isEnabled);
    	driver.quit();
        //assertTrue( true );
    
    	//$$('.modal-footer >.modal-footer-button-container span:nth-child(2) >.button-wrapper >.cw-button >.title')

	}

}
