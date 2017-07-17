package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by subbu on 7/15/2017.
 */
public class Product {

    WebDriver webDriver;

    public Product(WebDriver driver){
        this.webDriver = driver;
    }

    @FindBy(how = How.XPATH,using = "//ul[@id='s-results-list-atf']/li[1]/div/div[2]/div/div/a")
    WebElement item;

    @FindBy(how = How.CSS,using = "img[id='landingImage']")
    WebElement clickOnImage;

    @FindBy(how = How.XPATH,using = "//button[@data-action='a-popover-close']")
    WebElement close_popup;

    @FindBy(how = How.CSS,using = "#add-to-cart-button")
    WebElement addtoCart;

    public void select_product(){
        item.click();

    }

    public void click_image(){
        clickOnImage.click();
    }

    public void close_popup(){
        close_popup.click();

    }

    public void add_product_to_cart(){
        addtoCart.click();

    }
}
