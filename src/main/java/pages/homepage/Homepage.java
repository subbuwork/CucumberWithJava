package pages.homepage;

import org.openqa.selenium.WebDriver;

/**
 * Created by subbu on 7/14/2017.
 */
public class Homepage {

    WebDriver webDriver;

    public Homepage(WebDriver driver){
        this.webDriver = driver;
    }
    public void open(String url){
        webDriver.get(url);
    }

}
