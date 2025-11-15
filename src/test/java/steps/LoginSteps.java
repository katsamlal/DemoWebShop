package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);

    @Given("user is able to access login page")
    public void user_is_able_to_access_login_page()
    {
        openBrowserAndLaunchApplication();
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
    sendText(ConfigReader.read("username"), loginPage.emailField);
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
    loginPage.loginBtn.click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        String loginMessage = loginPage.loginMessage.getText();
        Assert.assertEquals("SmithJ@email.com", loginMessage);
    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        loginPage.emailField.sendKeys("iamjane@gmail.com");
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        loginPage.passwordField.sendKeys("pass123");
    }
    @Then("user sees login error message")
    public void user_sees_login_error_message() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", errorMessage);
    }


}
