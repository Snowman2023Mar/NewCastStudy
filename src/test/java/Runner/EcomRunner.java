package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//feature//",
		glue= {"stepDefs"}
		)

public class EcomRunner extends AbstractTestNGCucumberTests {

}
