package cucumber.main.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = "src/main/resources/features",
		glue = {"cucumber.main.steps"}
		)
@RunWith(Cucumber.class)
public class TestRunner {

}
