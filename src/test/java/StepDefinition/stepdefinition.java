package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cartpage;
import pages.Homepage;

public class stepdefinition {

	public static WebDriver driver;
	
	Homepage hp;
	Cartpage cp;
	
//	Robot robot = new Robot();

    @Given("I am on the basepage")
    public void i_am_on_the_basepage() throws AWTException {
    	driver = new ChromeDriver();
    	driver.get("https://www.bestbuy.com");
        driver.manage().window().maximize();
        hp= new Homepage(driver);
        cp= new Cartpage(driver);
    }

    @When("I select United States country")
    public void i_select_united_states_country() {
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      Actions action = new Actions(driver);
//
//      WebElement countrySelector = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img"));
//      js.executeScript("arguments[0].click();", countrySelector);
  	
    	hp.selectCountry();
    }

    @Then("i successfully landed on homepage of bestbuy")
    public void i_successfully_landedon_homepage_of_bestbuy() throws InterruptedException	{
    	hp.alerthandle();
//    	System.out.println(hp.validatingHomepage());
    	assertEquals(hp.validatingHomepage(),true);	
        }
    
    @Given("I am on the BestBuy home page")
    public void i_am_on_the_best_buy_home_page() {
        cp.clickSearch();
    }

    @When("I search for a product named <{string}>")
    public void i_search_for_a_product_named(String string) {
        cp.typeProduct("laptop");
    }

    @When("I select the product from the search results")
    public void i_select_the_product_from_the_search_results() {
        cp.clickSearch();	
        	
        
        	
        
    }

    @When("I click the {string} button")
    public void i_click_the_button(String string) {
        cp.addToCart();
    }

    @Then("The item <{string}> should be added to the cart")
    public void the_item_should_be_added_to_the_cart(String string) {
        cp.clickCart();
    }

//    @Then("The cart should reflect the correct quantity and details of <{string}>")
//    public void the_cart_should_reflect_the_correct_quantity_and_details_of(String string) {
//       
//    }

//
//    @When("I search for a product named <{string}>")
//    public void i_search_for_a_product_named(String string) {
//    	cp.clickSearch();       
//    }
//
//    @Then("The item <{string}> should be added to the cart")
//    public void the_item_should_be_added_to_the_cart(String string) {
//        
//    }
//
//    @Then("The cart should reflect the correct quantity and details of <{string}>")
//    public void the_cart_should_reflect_the_correct_quantity_and_details_of(String string) {
//        
//    }
//
////Scenario
//    @When("I search for {string}")
//    public void i_search_for(String string) {
//        
//    }
//
//    @When("I add {int} {string} to the cart")
//    public void i_add_to_the_cart(Integer int1, String string) {
//        
//    }
//
//    @Then("the cart should contain:")
//    public void the_cart_should_contain(io.cucumber.datatable.DataTable dataTable) {
//        
//    }
//
//    @When("I add {int} {string} to my wishlist\\/saved items")
//    public void i_add_to_my_wishlist_saved_items(Integer int1, String string) {
//        
//    }
//
//    @Then("my wishlist should contain:")
//    public void my_wishlist_should_contain(io.cucumber.datatable.DataTable dataTable) {
//        
//    }
//
//    @When("I add {string} to my wishlist")
//    public void i_add_to_my_wishlist(String string) {
//        
//    }
//
////Scenario
//    @Given("the user is on the your Cart page")
//    public void the_user_is_on_the_your_cart_page() {
//        
//    }
//
//    @Given("the user has added items to the cart")
//    public void the_user_has_added_items_to_the_cart() {
//        
//    }
//
//    @When("the user enters {string} as the shipping pincode")
//    public void the_user_enters_as_the_shipping_pincode(String string) {
//        
//    }
//
//    @When("the user proceeds to update location")
//    public void the_user_proceeds_to_update_location() {
//        
//    }
//
//    @Then("the system should display an error message indicating that the shipping pincode is invalid")
//    public void the_system_should_display_an_error_message_indicating_that_the_shipping_pincode_is_invalid() {
//        
//    }


}
