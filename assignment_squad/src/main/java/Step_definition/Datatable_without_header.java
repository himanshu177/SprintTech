package Step_definition;


import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.javafx.collections.MappingChange.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datatable_without_header {
	WebDriver wd;
	@Given("^User should be login$")
	public void user_should_be_login()  {
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	        wd.get("http://172.16.14.2:8010/index.php");
	        }

	@When("^enter credentials to login$")
	public void enter_credentials_to_login(DataTable usecredentials) throws Exception {
		List<List<String>> data = usecredentials.raw();
		wd.findElement(By.name("user_name_entry_field")).sendKeys(data.get(0).get(0));
		Thread.sleep(3000);
		wd.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(3000);
		Select p= new Select(wd.findElement(By.name("company_login_name")));
	    p.selectByVisibleText("SQUAD-2");
		Thread.sleep(3000);
		wd.findElement(By.name("SubmitUser")).click();
		Thread.sleep(5000);
	}

	@Then("^add customer in sales$")
	public void add_customer_in_sales(DataTable cust) throws InterruptedException  {
		
		java.util.List<java.util.List<String>> data1 = cust.raw();
		wd.findElement(By.linkText("Add and Manage Customers")).click();
		Thread.sleep(5000);
		wd.findElement(By.name("CustName")).sendKeys(data1.get(1).get(0));
		Thread.sleep(3000);
		wd.findElement(By.name("cust_ref")).sendKeys(data1.get(1).get(1));
		Thread.sleep(3000);
		wd.findElement(By.name("address")).sendKeys(data1.get(1).get(2));
		Thread.sleep(5000);
		wd.findElement(By.id("submit")).click();

	}

	@Then("^successfully add the customers$")
	public void successfully_add_the_customers()  {
		System.out.println("done");
	   
	}

}
