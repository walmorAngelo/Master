package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/Features", glue = "Steps", tags = "@tag", plugin = { "pretty",
				"html:target/report.html" }, monochrome = true, dryRun = false)


public class Runner {

}

