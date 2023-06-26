package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberTemirbek.html", "json:target/reportTemirbek.json"},
        features = "src/test/resources/features.temirbek_features",
        glue = "steps",
        tags = "@addProductWithTheSameNameTwice",
        dryRun = false
)
public class TemirbeckRunner {

}
