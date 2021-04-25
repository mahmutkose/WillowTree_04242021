package exp.willowTree.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        features = {"@target/rerun.txt"
        },

        glue = {"exp/willowTree/step_definitions"},
        dryRun = false
)

        public class FailedRunner {
}
