package Step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Excel_data_step {
	WebDriver wd;
	@Given("^login in bugzilla$")
	public void login_in_bugzilla() {
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	        wd.get("http://172.16.14.2:8007/index.cgi");
	        wd.findElement(By.id("login_link_top")).click();
	        
		
	  
	}

	@When("^user login with the following data with data in Excel at /home/luser/Desktop/bugzilla\\.xlsx$")
	public void user_login_with_the_following_data_with_data_in_Excel_at_home_luser_Desktop_bugzilla_xlsx() {
		wd.findElement(By.id("Bugzilla_login_top")).sendKeys();
		wd.findElement(By.id("Bugzilla_password_top")).sendKeys();
		wd.findElement(By.id("log_in_top")).click();
		
	   
	}

	@Then("^login sucessfully in bugzilla$")
	public void login_sucessfully_in_bugzilla()  {
		System.out.println("login sucessfully");
		
	   
	}



}
