package runners;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
                tags = "@contact-us", monochrome = true, dryRun = false,
                plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})


public class MainRunner extends AbstractTestNGCucumberTests {
	
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}