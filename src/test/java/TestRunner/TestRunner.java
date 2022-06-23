package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//usman.shafique//IdeaProjects//LMSProject//Features//Smoke.feature",
        glue = "Packagefiles",
        tags = "@regression"
)

public class TestRunner {

}
