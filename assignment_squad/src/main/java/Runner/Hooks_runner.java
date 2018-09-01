package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@Cucumber.Options(features="feature",glue={"stepDefinition"})
@CucumberOptions(
        features ="/home/luser/eclipse-workspace/assignment_squad/features/Hooks.feature",
        glue= "/home/luser/eclipse-workspace/assignment_squad/src/main/java/Step_defination/Hooks_step.java",
        dryRun=false
        )

public class Hooks_runner {

}
