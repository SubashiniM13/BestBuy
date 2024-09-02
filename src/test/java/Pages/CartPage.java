package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cartpage {

	WebDriver driver;
	 
	public Cartpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(xpath = "/*[@class='cart-label']")
	WebElement cart;
	public void clickCart() {
		cart.click();
	}
	
//	@FindBy(xpath = "//*[@id='gh-search-input']")
	@FindBy(xpath = "//input[@aria-label='Type to search. Navigate forward to hear suggestions']")
	WebElement search;
	public void typeProduct(String pdt) {
		search.clear();
        search.sendKeys(pdt);
    }
	
	@FindBy(xpath = "//button[@aria-label='submit search']")
    WebElement searchButton;
    public void clickSearch() {
		searchButton.click();
	} 
    
    @FindBy(xpath = "(//button[@data-button-state='ADD_TO_CART'])[1]")
    WebElement addToCart;
    public void addToCart() {
    	addToCart.click();
    }
    
    @FindBy(xpath = "//span[text()='Saved Items']")
    WebElement savedItems;
    public void savedItems() {
    	savedItems.click();
    }
    
    @FindBy(xpath = "//button[contains(@class,'c-button-unstyled flex')])[1]")
    WebElement addToWishList;
    public void addToWishList() {
    	addToWishList.click();
    }
    
    @FindBy(xpath = "//select[@class='tb-select chromexPathFinder1']")
    WebElement addQuantity;
    public void addQuantity() {
    	// addQuantity.selectByVisibleText(2).click(); 
    }
	
//    WebElement addQuantity = driver.findElement(By.xpath("//select[@class='tb-select chromexPathFinder1']")); 
//    new Select().selectByValue("2"); 
	
    @FindBy(xpath = "//div[@id='cartApp']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[5]/ul[1]/li[7]/section[1]/div[2]/div[3]/button[2]")
    WebElement removePdtFromCart;
    public void removePdtFromCart() {
    	removePdtFromCart.click();
    }
 
    @FindBy(xpath = "//button[@data-testid='save-for-later-heart-button'])[1]")
    WebElement removePdtFromWishList;
    public void removePdtFromWL() {
    	removePdtFromWishList.click();
    }
	
 
    @FindBy(xpath = "//button[@class='btn-default-link change-zipcode-link'])[2]")
    WebElement invalidZipCode;
    public void invalidZipCode() {
    	invalidZipCode.click();
    }
    
    @FindBy(xpath = "//input[@placeholder='ZIP or City, State']")
	WebElement updateLoc;
	public void updateLoc(CharSequence[] zipCode) {
        updateLoc.sendKeys(zipCode);
    }
	
	@FindBy(xpath = "//button[text()='Update']")
    WebElement updateButton;
    public void updateButton() {
    	updateButton.click();
    }
   
    @FindBy(xpath = "//button[@class='c-close-icon'])[2]")
    WebElement closeButton;
    public void closeButton() {
    	closeButton.click();
    }
    
}


