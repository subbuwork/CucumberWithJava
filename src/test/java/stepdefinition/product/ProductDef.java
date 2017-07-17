package stepdefinition.product;

import Utils.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.homepage.Homepage;
import pages.product.Product;
import pages.search.SearchPage;

import java.util.List;

/**
 * Created by subbu on 7/14/2017.
 */

public class ProductDef {

    WebDriver webDriver;
    Browser browser;
    enum browser_names{GC,IE,FF,EDGE}
    //SearchPage searchPage;

    public ProductDef(){
        browser = new Browser();
    }

    @Before
    public void setup(){
        webDriver = browser.open_browser(browser_names.IE.toString());
    }

    @Given("Go To:(.*)")
    public void home_Page(List<String> urls){
        Homepage homepage = PageFactory.initElements(webDriver,Homepage.class);
        homepage.open(urls.get(0).toString().trim());
    }

    @Then("User enters search term and clicks on search button:(.*)")
    public void enter_search_term_and_click_search_button(List<String> searchTerms){
        SearchPage searchPage = PageFactory.initElements(webDriver,SearchPage.class);
        searchPage.search_products(searchTerms.get(0).toString().trim());
    }

    @And("User Select Product From The Result List")
    public void select_product_from_result_list(){
        Product product = PageFactory.initElements(webDriver,Product.class);
        product.select_product();

    }

    @And("Verify selected product")
    public void verify_product(){
        Product product = PageFactory.initElements(webDriver,Product.class);
        product.click_image();
        product.close_popup();
    }

    @Then("Add product to the cart")
    public void addP_product_to_cart(){
        Product product = PageFactory.initElements(webDriver,Product.class);
        product.add_product_to_cart();

    }

    @After
    public void teardown(){
        webDriver.quit();
    }
}
