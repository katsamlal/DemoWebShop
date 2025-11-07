package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {
    @Given("user is able to access login page")
    public void user_is_able_to_access_login_page() {
        openBrowserAndLaunchApplication();
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {

    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
