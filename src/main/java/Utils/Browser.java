package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by subbu on 7/14/2017.
 */
public class Browser extends BrowserBase {

    private  WebDriver webDriver;
    private  enum browser_names{GC,FF,IE,EDGE};
    PropertiesReader propsReader;

    public Browser(){
        propsReader = new PropertiesReader();
    }

    public WebDriver open_browser(String browserName){
        if (browserName.equalsIgnoreCase(browser_names.GC.toString())){
            System.out.println("Dirver name::"+browser_names.GC.toString());
            System.setProperty("webdriver.chrome.driver",propsReader.driver(browser_names.GC.toString()));
            webDriver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase(browser_names.IE.toString())){
            System.setProperty("webdriver.ie.driver",propsReader.driver(browser_names.IE.toString()));
            webDriver = new InternetExplorerDriver();
        }else if (browserName.equalsIgnoreCase(browser_names.FF.toString())){
            System.setProperty("webdriver.gecko.driver",propsReader.driver(browser_names.FF.toString()));
            webDriver = new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase(browser_names.EDGE.toString())){
            System.setProperty("webdriver.gecko.driver",propsReader.driver(browser_names.EDGE.toString()));
            webDriver = new EdgeDriver();
        }
     return webDriver;
    }
}
