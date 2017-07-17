package pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by subbu on 7/15/2017.
 */
public class SearchPage {

    WebDriver webDriver;

    public SearchPage(WebDriver driver){
        this.webDriver = driver;
    }

    @FindBy(how = How.ID,using = "twotabsearchtextbox")
    WebElement searchbox;

    @FindBy(how = How.CSS,using = "input[value='Go']")
    WebElement searchButton;

    public void search_products(String searchTerm){
        searchbox.sendKeys(searchTerm);
        searchButton.click();
    }
}
