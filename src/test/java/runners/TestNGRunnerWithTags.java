package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", // relative path to your .feature files
		glue = { "stepdefinitions", "Hooks"}, tags = "@InvalidLogin",
		
		
		// package names for step defs + hooks
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" }, monochrome = true)

public class TestNGRunnerWithTags extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)  // can set true for parallel runs
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
