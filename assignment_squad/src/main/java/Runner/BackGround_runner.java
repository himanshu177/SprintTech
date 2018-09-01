		
package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@Cucumber.Options(features="feature",glue={"stepDefinition"})
@CucumberOptions(
        features ="/home/luser/eclipse-workspace/assignment_squad/features/BackGround.feature",
        glue= "home/luser/eclipse-workspace/assignment_squad/src/main/java/Step_defination/Background_step.java",
	      format= {"html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}

		)

public class BackGround_runner{

}
