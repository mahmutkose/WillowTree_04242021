package exp.willowTree.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",  "json:target/cucumber.json", "rerun:target/rerun.txt" },
        features = {"src/test/resources/features"},
        glue = {"exp/willowTree/step_definitions"},
        dryRun = false,
        tags="",
        publish = true







)





public class MainRunner {

}
