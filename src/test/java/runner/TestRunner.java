package runner;

import io.cucumber.java.es.Cuando;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "stepDef",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
        tags = "@loginvalid"
)
public class TestRunner {
}
