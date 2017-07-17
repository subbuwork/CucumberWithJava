package runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by subbu on 7/15/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/products"},
                 glue = {"classpath:stepdefinition.product"},
                 plugin = {"html:target/selecthtmlreport"})
public class Select_Product_Runner_Class {
}
