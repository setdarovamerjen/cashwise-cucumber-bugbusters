package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      //  temirbek-add-product-sales-page
        plugin = {"html:target/cucumberTem.html", "json:target/reportTem.json"},
        features = "src/test/resources/features/temirbek_features",
        glue = "steps",
        tags = "@temirbek",
        dryRun = false
)
public class TemirbeckRunner {

}
