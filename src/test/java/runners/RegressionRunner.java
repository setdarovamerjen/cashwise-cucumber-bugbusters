package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberRegression.html", "json:target/reportRegression.json"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@first_sprint",
        dryRun = false
)
public class RegressionRunner {

}
