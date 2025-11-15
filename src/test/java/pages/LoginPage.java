package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="Email")
    public WebElement emailField;

    @FindBy(id="Password")
    public WebElement passwordField;

    @FindBy(className = "button-1 login-button")
    public WebElement loginBtn;

    @FindBy(className = "account")
    public WebElement loginMessage;

    @FindBy(className = "validation-summary-errors")
    public WebElement errorMessage;
}
