package Step_definition;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.javafx.collections.MappingChange.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datatable_with_header {
	WebDriver wd;
	@Given("^User must be login$")
	public void user_must_be_login()  {
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        //wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
		wd.get("http://172.16.14.2:8004/app/login.php?login=no");
	    
	   
	}

	@When("^User enter credentials to login$")
	public void user_enter_credentials_to_login(DataTable usecredentials) throws Exception  {
		for (java.util.Map<String, String> data : usecredentials.asMaps(String.class, String.class)){
		wd.findElement(By.id("username")).sendKeys(data.get("uid"));
		wd.findElement(By.id("password")).sendKeys(data.get("pwd"));
		Thread.sleep(2000);
	wd.findElement(By.className("btn")).click();
	   }
	}
	@Then("^Login Sucessfull in ice hrm$")
	public void login_Sucessfull_in_ice_hrm()  {
		System.out.println("login sucessfull in ice-hrm");
	 
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		System.out.println("user is on home page");
		
		
	}
	
		@Then("^click on  Qualifications Setup$")
		public void click_on_Qualifications_Setup() throws Exception  {
		wd.findElement(By.xpath(".//*[@id='admin_Admin']/li[4]/a")).click();
	    Thread.sleep(5000);
	    
			
			
		
		}

		@Then("^enter the skill$")
		public void enter_the_skill(DataTable job) throws Exception  {
			for (java.util.Map<String, String> data : job.asMaps(String.class, String.class)){
							
			wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[1]/div[1]/div[1]/div/button")).click();
		    Thread.sleep(5000);
			wd.findElement(By.id("name")).sendKeys(data.get("Name"));
			wd.findElement(By.id("description")).sendKeys(data.get("Description"));
			Thread.sleep(5000);
			wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[1]/div[2]/form/div/div[4]/div[1]/button[1]")).click();
			Thread.sleep(5000);
			
			System.out.println("done");
		   
		}

	   
	
		}
}
	