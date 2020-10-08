package stepDefnitions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefnition {


	@RunWith(Cucumber.class)
		public class StepDefnition {

		    @Given("^user is on net banking page$")
		    public void user_is_on_net_banking_page() throws Throwable {
		        
		    }

		    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
		    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		        
		    }

		    @Then("^Home page is populated $")
		    public void home_page_is_populated() throws Throwable {
		        
		    }

		    @And("^Cards are displayed$")
		    public void cards_are_displayed() throws Throwable {
		        
		    }

		}

	}


}
