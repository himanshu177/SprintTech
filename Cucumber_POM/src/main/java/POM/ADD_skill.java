package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 

public class ADD_skill {

	 
	
		WebDriver driver;
		
		public ADD_skill(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void add_skill(String search) {
			driver.navigate().to("");
		}
		
		public void navigateTo_HomePage() {
			driver.get("http://www.shop.demoqa.com");
		}
	 
	}


