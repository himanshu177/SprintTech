package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form[1]/fieldset/button")
	WebElement submit;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enter_username(String user) {
		username.sendKeys("admin");
	}
	
	public void enter_password(String pwd) {
		password.sendKeys("Squad123");
	}
 
	public void submit(String sub) {
		submit.click();
	}
}
