package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        tags = "",
        plugin = {"pretty","html:target/cucumber.html", "junit:target/surefire-reports/TestResults.xml"}
)

public class TestRunner {

}
