package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart {

	WebDriver driver = new ChromeDriver();

    @Given("I am on the BestBuy home page")
    public void i_am_on_the_bestbuy_home_page() {
        driver.get("https://www.bestbuy.com");
    }
    
    @When("I select the country option if needed")
    public void i_select_the_country_option_if_needed() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        WebElement countrySelector = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img"));
        js.executeScript("arguments[0].click();", countrySelector);
    }

    @When("I search for a product named {string}")
    public void i_search_for_a_product_named(String productName) {
        WebElement searchBox = driver.findElement(By.id("search-input"));
        searchBox.sendKeys(productName);
        searchBox.submit();
    }

    @When("I select the product from the search results")
    public void i_select_the_product_from_the_search_results() {
        WebElement product = driver.findElement(By.cssSelector(".sku-item"));
        product.click();
    }

    @When("I choose any necessary options if applicable")
    public void i_choose_any_necessary_options_if_applicable() {
        // Implementation for selecting options if needed
    }

    @When("I click the {string} button")
    public void i_click_the_button(String buttonText) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        button.click();
    }

    @Then("The item {string} should be added to the cart")
    public void the_item_should_be_added_to_the_cart(String productName) {
        // Verification code to ensure the product is added to the cart
    }

    @Then("The cart should reflect the correct quantity and details of {string}")
    public void the_cart_should_reflect_the_correct_quantity_and_details_of(String productName) {
        // Verification code to ensure the cart has correct details
    }
}
