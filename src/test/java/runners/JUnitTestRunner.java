package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/logout.feature", 
glue = { "stepdefinitions", "Hooks" },
plugin = { "pretty", "html:target/cucumber-report.html" }, 
monochrome = true)

public class JUnitTestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)  // can set true for parallel runs
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
