package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@Cucumber.Options(features="feature",glue={"stepDefinition"})
@CucumberOptions(
        features ="/home/luser/eclipse-workspace/assignment_squad/features/tagging.feature",
        glue= "/home/luser/eclipse-workspace/assignment_squad/src/main/java/Step_defination/Tagging_step.java",
         tags = {"@SmokeTest "},
         dryRun=false
        )
public class Tagging_runner {

}
