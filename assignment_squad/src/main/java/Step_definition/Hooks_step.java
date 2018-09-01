package Step_definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_step {
	@Before(order=1)
	public void setup() {
		System.out.println("before1");
		
	}
	
	@After(order=0)
	public void down() {
		System.out.println("after0");
	}
	
	
	@Before(order=0)
	public void setup1() {
		System.out.println("before0");
		
	}
	
	@After(order=1)
	public void down1() {
		System.out.println("after1");
	}
	
	
	@Given("^quotation entry done$")
	public void quotation_entry_done()  {
		System.out.println("new quotation entry");
	    
	}

	@When("^generate token number$")
	public void ganerate_tokan_number()  {
		System.out.println("token no");
	   
	}

	@Then("^successfully generate the token$")
	public void successfully_generate_the_token()  {
		System.out.println("done");
	   
	}

}
