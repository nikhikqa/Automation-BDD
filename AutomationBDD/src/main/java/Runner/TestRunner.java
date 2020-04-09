package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Nitin Nikhil\\eclipse-workspace\\AutomationBDD\\src\\main\\java\\Features\\Login.feature",
		glue ="C:\\Users\\Nitin Nikhil\\eclipse-workspace\\AutomationBDD\\src\\main\\java\\Step_Defination\\LoginSteps.java"
		
		
		
		)


public class TestRunner {

}
