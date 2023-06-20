package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber", "json:target/report.json"},
        features = "src/test/resources/features/temirbeck_features",
        glue = "steps",
        //tags = "@regression",
        dryRun = true
)
public class TemirbeckRunner {
}
