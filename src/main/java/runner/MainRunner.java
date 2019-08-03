package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                 features = {"src/main/resources/features"},
                 glue = {"stepdefinitions"},
                 plugin = {"html:target/cucumber-reports"},
                 tags = {"@all_scenarios"})
public class MainRunner {
}
