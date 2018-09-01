package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackGround_step {
	WebDriver wd;
	@Given("^user should  navigate to the login page$")
	public void user_should_navigate_to_the_login_page(){
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        //wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
		wd.get("http://172.16.14.2:8004/app/login.php?login=no");
	    
	}

	@When("^user  should submit valid username and valid password$")
	public void user_should_submit_valid_username_and_valid_password() throws Exception{
		wd.findElement(By.id("username")).sendKeys("admin");
		wd.findElement(By.id("password")).sendKeys("Squad123");
		Thread.sleep(2000);
	wd.findElement(By.className("btn")).click();
	
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() {
		System.out.println("user is logged in");
	
	}

	@Given("^click on project under project setup$")
	public void click_on_project_under_project_setup() throws Exception {
	   Thread.sleep(1000);
		
	   wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click(); 
	   Thread.sleep(2000);
		wd.findElement(By.id("tabProject")).click();
		Thread.sleep(4000);
    wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
    Thread.sleep(5000);
    
	    
	}

   @When("^add new project$")
	public void add_new_project() throws Exception  {
		wd.findElement(By.id("name")).sendKeys("TyreExpress");
		   /* Select s= new Select(wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[2]/div[2]/form/div/div[3]/div[1]/div/Select")));
		    s.selectByValue("IceHrm Sample Client 2");  */
		    Thread.sleep(5000);
		    wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[2]/div[2]/form/div/div[3]/div[1]/div/a")).click();
		    wd.findElement(By.xpath("html/body/div[12]/ul/li[3]/div")).click();
		    Thread.sleep(5000);
		    wd.findElement(By.id("details")).sendKeys("Vashi client project");
		    Thread.sleep(2000);
		    Select s1= new Select(wd.findElement(By.id("status")));
		    s1.selectByValue("Completed");  
		    Thread.sleep(5000);
		    wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[2]/div[2]/form/div/div[6]/div[1]/button[1]")).click();
		    
	
	}

	@Then("^project  is created sucessfuly$")
	public void project_is_created_sucessfuly()  {
		System.out.println("project is created sucessfuly");
	   
	}
	
	@Given("^click on client under project/client setup$")
	public void click_on_client_under_project_client_setup() throws InterruptedException  {
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click(); 
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(4000);
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	}
	@When("^add new client$")
	public void add_new_client() throws Exception  {
		wd.findElement(By.id("name")).sendKeys("sprintqa");
		wd.findElement(By.id("details")).sendKeys("testing company in mahape");
		wd.findElement(By.id("address")).sendKeys("ghansoli MBP");
		 Select s2= new Select(wd.findElement(By.id("status")));
		    s2.selectByValue("Active");  
		    Thread.sleep(5000);
		wd.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		
	   
	}

	@Then("^client is created sucessfuly$")
	public void client_is_created_sucessfuly() {
		System.out.println("client is added sucessfully");
	    
	}




}
