package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C://sridaran//Selenium-java//eclipse-workspace//Selenium-Cucumber//Features//OrangeHRM.feature",	
		glue="StepDefinitions"
		)
public class TestRunner {
		
}
