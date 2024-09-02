package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.util.Duration;

public class Homepage {

	WebDriver driver;
	WebDriverWait wait;
	Robot robot;
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	
	public Homepage(WebDriver driver) throws AWTException {
		robot = new Robot();	
//		wait = new WebDriverWait(driver, Duration.OfSeconds(10));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[2]/div/div/div/div/div[2]/a[2]")
	 WebElement countrySelect;
	
	@FindBy(tagName ="body")
	WebElement body;
	
	public void selectCountry() {
        countrySelect.click();
    }
	
	//*[@id="shop-header-43130694"]/div/div[1]/header/div[3]/div/a/svg
	
	
	public void alerthandle() throws InterruptedException {
		try {
			
			Robot robo = new Robot();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);
	//			robo.keyPress(KeyEvent.VK_TAB);
	//			Thread.sleep(500);
	//			robo.keyPress(KeyEvent.VK_TAB);
	//			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(500);
				
		}catch(AWTException e) {
			e.printStackTrace();
		}
			}
	
	public boolean validatingHomepage(){
	
		boolean bool = driver.findElement(By.xpath("//*[@aria-label ='BestBuy.com']")).isDisplayed();
		return bool;
		
	}
//	public void scrollDown() {
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("window.scroll(0,680)");
//    }
}
