package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.util.Duration;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	Robot robot;
	
	public HomePage(WebDriver driver) throws AWTException {
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
	
	public void alerthandle() throws InterruptedException {
		try {
			Robot robo = new Robot();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
	//			robo.keyPress(KeyEvent.VK_TAB);
	//			Thread.sleep(500);
	//			robo.keyPress(KeyEvent.VK_TAB);
	//			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
		}catch(AWTException e) {
			e.printStackTrace();
		}
	}
//	public void scrollDown() {
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("window.scroll(0,680)");
//    }
}
