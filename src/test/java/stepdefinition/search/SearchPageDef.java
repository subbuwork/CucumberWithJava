package stepdefinition.search;

import Utils.Browser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.homepage.Homepage;
import pages.search.SearchPage;
import stepdefinition.home.HomePageDef;

import java.util.List;

/**
 * Created by subbu on 7/14/2017.
 */
public class SearchPageDef {

    WebDriver webDriver;
    Browser browser;
    enum browser_names{GC,IE,FF,EDGE}
    SearchPage searchPage;

    public SearchPageDef(){
      browser = new Browser();

    }
    @Before
    public void setup(){
        webDriver = browser.open_browser(browser_names.FF.toString());
    }
    @Given("Go To:(.*)")
    public void home_page(List<String> url){
        Homepage homepage = PageFactory.initElements(webDriver,Homepage.class);
        homepage.open(url.get(0).toString());
    }

    @When("Enter Search Term And Click On Search Button:(.*)")
    public void search_items(List<String> searchTerm){
        SearchPage searchPage = PageFactory.initElements(webDriver,SearchPage.class);
        searchPage.search_products(searchTerm.get(0).toString());
    }


    @Then("Close Browser")
    public void close_browser()throws Exception{
        Thread.sleep(4000);
        webDriver.quit();
    }
}
