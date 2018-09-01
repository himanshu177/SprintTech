package Step_definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DD_outline_exp {
	WebDriver wd;
	@Given("^user must be login$")
	public void user_must_be_login(){
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	        wd.get("http://172.16.14.2:8010/index.php");
	        }
	   
	
	@When("^enter enters\"(.*?)\"and \"(.*?)\"$")
	public void enter_enters_and(String username, String password) throws InterruptedException {	
	wd.findElement(By.name("user_name_entry_field")).sendKeys(username);
	Thread.sleep(3000);
	wd.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(3000);
	Select p= new Select(wd.findElement(By.name("company_login_name")));
    p.selectByVisibleText("SQUAD-2");
	Thread.sleep(3000);
	wd.findElement(By.name("SubmitUser")).click();
	Thread.sleep(5000);
	  
	}
	 
	@Then("^click on add new custmer and manage customer link$")
	public void click_on_add_new_custmer_and_manage_customer_link() throws Exception {
		wd.findElement(By.linkText("Add and Manage Customers")).click();
		Thread.sleep(5000);
	  
	}

	@Then("^user enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and_and(String CustomerName, String CustomerShortName, String Address) throws Exception  {
		
		wd.findElement(By.name("CustName")).sendKeys(CustomerName);
		Thread.sleep(3000);
		wd.findElement(By.name("cust_ref")).sendKeys(CustomerShortName);
		Thread.sleep(3000);
		wd.findElement(By.name("address")).sendKeys(Address);
		Thread.sleep(5000);
		wd.findElement(By.id("submit")).click();
		
	   
	}

	@Then("^successfull login and add the customer entry$")
	public void successfull_login_and_add_the_customer_entry() {
		System.out.println("successfully add the customer");
	   
	}



}
