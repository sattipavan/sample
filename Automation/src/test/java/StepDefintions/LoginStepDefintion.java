package StepDefintions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginStepDefintion {
	
	   
	@Given("^user should be in login page$")
	    public void user_should_be_in_login_page()
	    {
	    	System.out.println("given");
	    }
	    @When("^user login with valid credentials$")
	    public void user_should_be_login_with_ValidCredentials() 
	    {
	    	System.out.println("when");
	    	
	    }
	    @Then("^Dashboard page is displayed$")
	    public void user_should_be_in_DashBoard() throws Throwable
	    {
	    	System.out.println("Then");
	    	
	    }
	    @And("^customer accounts are  displayed$") 
	    public void account_DashBoard() throws Throwable
	    {
	    	System.out.println("AND");
	    	
	    }
	
	    
}
	
