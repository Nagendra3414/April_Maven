package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = {"D:\\Selenium_Projects\\April_Maven\\src\\test\\java\\features"},
		glue = {"stepDefinition"},
		tags = " @Regression",
		monochrome = true,
		plugin = {"pretty", "html:target/AutomationTesting.html"}
		
		
		
		//tags = "@Smoke" - we want to run only Smoke test cases
		//tags = "@Smoke or @Regression" - we want to run both Smoke test cases and regression
		
		//tags = "@Smoke and @Regression" - we want to run test with those two tags
		
		
		
		)





public class TestRunner {

}
