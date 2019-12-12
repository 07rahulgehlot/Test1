package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features/test.feature", glue = "Step_definitions", format = { "pretty", "html:test-output",
				"json:json_output/cucumber.json","junit:jnuint_output_junit_xml_output/cucumber.xml" },
	    dryRun=false,
		monochrome = true,
		strict=false
		
		)	
public class TestRunner {

}
