package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "C:/Users/a841094/eclipse-workspace/BDDFramework/src/main/java/Features/login.feature"
		,glue= {"stepDefinition"}
		)


public class TestRunner {
	

}