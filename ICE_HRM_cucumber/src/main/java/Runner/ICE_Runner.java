package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@Cucumber.Options(features="feature",glue={"stepDefinition"})
@CucumberOptions(
        features ="/home/luser/eclipse-workspace/ICE_HRM_cucumber/feature/ICE-HRM.feature",
        glue= "/home/luser/eclipse-workspace/ICE_HRM_cucumber/src/main/java/Step_Definition/ICE_step_Definition.java",
        tags= {"@AddJobtitle"},
       format = {"pretty","html:target/cucumber"},
       monochrome=true
        )

public class ICE_Runner{

}
