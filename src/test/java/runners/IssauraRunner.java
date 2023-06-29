package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberissaura.html", "json:target/reportissaura.json"},
        features = "src/test/resources/features/issaura_features",
        glue ="steps",
        //tags ="@contact1",
        dryRun =false

)
public class IssauraRunner {
}