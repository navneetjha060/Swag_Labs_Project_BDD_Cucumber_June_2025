package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/login.feature", 
glue = { "stepdefinitions", "Hooks" },
plugin = { "pretty", "html:target/cucumber-report.html" }, 
monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
