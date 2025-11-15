package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(className="ico-login")
    public WebElement loginLink;
}
