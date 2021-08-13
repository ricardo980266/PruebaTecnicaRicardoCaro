package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginFeature", glue = { "StepDefinitions" }, monochrome = true, plugin = {
		"pretty", "junit:target/JUnitReport.xmk" }, tags = "@smoketest")
public class TestRunner {

}
