package Step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class When_passing_credentials {
	WebDriver wd;
	@Given("^user must be login in dolibar$")
	public void user_must_be_login_in_dolibar()  {
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	        wd.get("http://172.16.14.2:8008/");
	        
	        
	    
	}

	@When("^enter \"(.*?)\" and \"(.*?)\"$")
	public void enter_and(String usr, String pwd) {
		wd.findElement(By.id("username")).sendKeys(usr);
		
		wd.findElement(By.id("password")).sendKeys(pwd);
		wd.findElement(By.className("button")).click();
		
	    
	}

	@Then("^Login Sucessfull in dolibar$")
	public void login_Sucessfull_in_dolibar() throws Throwable {
		System.out.println("login is succesfull when credentials is given in program");
	 
	}



}
