package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	//@Cucumber.Options(features="feature",glue={"stepDefinition"})
	@CucumberOptions(
	        features ="home/luser/Desktop/software/cucumber/features/ice_demo.feature",
	        glue= "home/luser/Desktop/software/cucumber/src/test/java/step_definition/ice_hrm_step1.java",
	   
	      format= {"pretty","html:test-output"},
	        monochrome=true
	        )

	public class Runner_hrms {

	}

