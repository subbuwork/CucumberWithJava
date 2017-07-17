package runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by subbu on 7/14/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/homepage"},
                 glue = {"stepdefinition/home"},
                 plugin = {"html:target/homepagehtmlreport"})
public class Home_Page_Test_Runner {
}
