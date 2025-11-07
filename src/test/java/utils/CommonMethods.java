package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;

    public void openBrowserAndLaunchApplication() {
        switch (ConfigReader.read("browser")) {
            case "Chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                break;
            case "FireFox":
                driver = new FirefoxDriver();
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url"));
        initializerPageObjects();
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
