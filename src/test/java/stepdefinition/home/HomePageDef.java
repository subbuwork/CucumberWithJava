package stepdefinition.home;

import Utils.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.homepage.Homepage;

/**
 * Created by subbu on 7/14/2017.
 */
public class HomePageDef {

    WebDriver webDriver;
    Browser browser;
    enum browser_name{GC,FF,IE,EDGE}

    public HomePageDef(){
        browser = new Browser();
    }

    @Before
    public void setup(){
        webDriver = browser.open_browser(browser_name.GC.toString());
    }

    @Given("^Go To \"([^\"]*)\"$")
    public void home_page(String url)throws Exception{
        Homepage homepage = PageFactory.initElements(webDriver,Homepage.class);
        homepage.open(url);


    }

    @After
    public void teardown(){
        webDriver.quit();
    }
}
