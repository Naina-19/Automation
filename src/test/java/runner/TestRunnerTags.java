package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\singh\\IdeaProjects\\POMdemo\\src\\test\\java\\feature\\Tags.feature" ,
        glue={"steps"},
        //tags="@smoke or @regression"
        tags="@mustRun"
        //tags="@smoke and @regression"
        //tags="@regression and not @smoke"
        //tags="(@smoke or @regression) and not @important"
)

public class TestRunnerTags {
}
