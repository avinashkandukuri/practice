package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue={"stepdefination"},
format={"pretty", "html:target/Destination","json:target/Destination/cucumber.json",
		"htlm:target/cucumber-html-report"})
public class Testrunner {

	
}
