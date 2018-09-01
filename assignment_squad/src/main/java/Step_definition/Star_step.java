package Step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class Star_step {
    WebDriver wd;
	@Given("^login in mantis$")
	public void login_in_mantis()  {
		 System.setProperty("webdriver.gecko.driver","/home/luser/Desktop/Selenium_PlugIns/geckodriver");
	        wd=new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	        wd.get("http://172.16.14.2:8003/login_page.php");
	    
	}

	@Given("^enter credentials to login in mantis$")
	public void enter_credentials_to_login_in_mantis() throws InterruptedException{
		wd.findElement(By.id("username")).sendKeys("administrator");
		Thread.sleep(5000);
		wd.findElement(By.partialLinkText("width-40 pull-right btn btn-success btn-inverse bigger-110")).click();

	}

	@Given("^login sucessfully in mantis$")
	public void login_sucessfully_in_mantis()  {
		System.out.println("login successfully");
	   
	}
}
