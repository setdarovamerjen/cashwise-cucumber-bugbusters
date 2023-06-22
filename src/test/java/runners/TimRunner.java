package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberTim.html", "json:target/reportTim.json"},
        features = "src/test/resources/features/tim_features",
        glue = "steps",
        tags = "@loginTest",
        dryRun = true
)
public class TimRunner {
}
