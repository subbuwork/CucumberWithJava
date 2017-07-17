package runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by subbu on 7/14/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/search"},
                 glue = {"classpath:stepdefinition.search"},
                 plugin = {"html:target/searchhtmlreport"})
public class Search_Product_Test_Runner_Class {
}
