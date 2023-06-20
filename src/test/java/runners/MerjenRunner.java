package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber.html", "json:target/report.json"},
        features = "src/test/resources/features/merjen_features",
        glue = "steps",
        //tags = "@regression",
        dryRun = false
)
public class MerjenRunner {
}
