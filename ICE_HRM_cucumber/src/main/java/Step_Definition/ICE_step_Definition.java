package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICE_step_Definition {
	WebDriver wd;
	@Given("^user must navigate to the login page of ice-hrm$")
	public void user_must_navigate_to_the_login_page_of_ice_hrm() {
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        //wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
		wd.get("http://172.16.14.2:8004/app/login.php?login=no");   
	}

	@When("^user must submit valid credentials$")
	public void user_must_submit_valid_credentials(DataTable usecredentials) throws Exception {
		for (java.util.Map<String, String> data : usecredentials.asMaps(String.class, String.class)){
			wd.findElement(By.id("username")).sendKeys(data.get("USERNAME"));
			wd.findElement(By.id("password")).sendKeys(data.get("PASSWORD"));
			Thread.sleep(2000);
		wd.findElement(By.className("btn")).click();
		}
	}

	@Then("^user should be logged in project$")
	public void user_should_be_logged_in_project() {
	 System.out.println("login successfully");
	    
	}

	@Given("^click on add project under project setup in Admin module$")
	public void click_on_add_project_under_project_setup_in_Admin_module() throws Exception {
		 wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click(); 
		   Thread.sleep(2000);
			wd.findElement(By.id("tabProject")).click();
			Thread.sleep(4000);
	    wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	    Thread.sleep(5000);
	    }

	@When("^Add new project in ice-hrm$")
	public void add_new_project_in_ice_hrm() throws Exception  {
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

	@Then("^project is created successfuly in ice-hrm$")
	public void project_is_created_successfuly_in_ice_hrm() {
	   System.out.println("PROJECT IS ADDED SUCCESSFULLY");
	   
	}

	@Given("^click on client under client setup in Admin Module$")
	public void click_on_client_under_client_setup_in_Admin_Module() throws Exception  {
		 wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click(); 
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(4000);
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	    
	}

	@When("^Add new client in ice-hrm$")
	public void add_new_client_in_ice_hrm() throws Exception {
		wd.findElement(By.id("name")).sendKeys("sprintqa");
		wd.findElement(By.id("details")).sendKeys("testing company in mahape");
		wd.findElement(By.id("address")).sendKeys("ghansoli MBP");
		 Select s2= new Select(wd.findElement(By.id("status")));
		    s2.selectByValue("Active");  
		    Thread.sleep(5000);
		wd.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		
	   
	}

	@Then("^client is created successfuly in ice-hrm$")
	public void client_is_created_successfuly_in_ice_hrm() {
	   System.out.println("CLIENT IS ADDED SUCCESSFULLY");
	    
	}

	@Given("^click on Add new skill under Qualifications setup in Admin module$")
	public void click_on_Add_new_skill_under_Qualifications_setup_in_Admin_module() throws Exception {
		wd.findElement(By.xpath(".//*[@id='admin_Admin']/li[4]/a")).click();
	    Thread.sleep(5000);
	   
	}

	@When("^Enters the following Skills$")
	public void enters_the_following_Skills(DataTable skill) throws Exception  {
		for (java.util.Map<String, String> data : skill.asMaps(String.class, String.class)){
			
		wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[1]/div[1]/div[1]/div/button")).click();
	    Thread.sleep(5000);
		wd.findElement(By.id("name")).sendKeys(data.get("Name"));
		wd.findElement(By.id("description")).sendKeys(data.get("Description"));
		Thread.sleep(5000);
		wd.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div/div/div[1]/div[2]/form/div/div[4]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		}
	}

	@Then("^Skill is added successfuly in Ice-hrm$")
	public void skill_is_added_successfuly_in_Ice_hrm(){
		System.out.println("skill is added sucessfully");
	}

	@Given("^click on add new job-title under job-Detail setup under Admin -module$")
	public void click_on_add_new_job_title_under_job_Detail_setup_under_Admin_module() throws Exception {
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(5000);
	
	    
	}

	@When("^click on add new job-title$")
	public void click_on_add_new_job_title(){
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	}

	@Then("^user enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and_and_and(String JobTitleCode, String JobTitle, String Description , String Specification) throws Exception  {
		wd.findElement(By.id("code")).sendKeys(JobTitleCode );
		Thread.sleep(3000);
		wd.findElement(By.id("name")).sendKeys(JobTitle);
		Thread.sleep(3000);
		wd.findElement(By.id("description")).sendKeys(Description);
		Thread.sleep(5000);
		wd.findElement(By.id("specification")).sendKeys(Specification);
		Thread.sleep(5000);
		wd.findElement(By.partialLinkText("Save")).click();
	  
	}

	@Then("^successfully add the job-title entry$")
	public void successfully_add_the_job_title_entry() {
	    System.out.println("job-titles are added successfully");
	   
	}


}
