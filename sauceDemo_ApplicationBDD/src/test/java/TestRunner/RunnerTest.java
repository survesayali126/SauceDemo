package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFiles"},
		glue= {"pageStepDef"},
		dryRun=false
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
