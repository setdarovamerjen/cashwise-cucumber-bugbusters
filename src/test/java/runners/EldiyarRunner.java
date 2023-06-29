package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber", "json:target/report.json"},
        features = "src/test/resources/features/eldiyar_features",
        glue = "steps",
        tags = "@invoice",
        dryRun = false
)
public class EldiyarRunner {

}

