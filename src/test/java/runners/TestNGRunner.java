package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/logout.feature", // relative path to your .feature files
		glue = { "stepdefinitions", "Hooks" }, // package names for step defs + hooks
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" }, monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)  // can set true for parallel runs
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
