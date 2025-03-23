package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\singh\\IdeaProjects\\POMdemo\\src\\test\\java\\feature\\LoginDemo.feature", // Path to feature files
        glue = {"steps"}, // Package containing step definitions
        plugin = {"pretty", "html:target/HtmlReport.json"}, // Reports generation
        monochrome = true // For readable console output
)
public class TestRunnerForLoginUsingPOM {
}
