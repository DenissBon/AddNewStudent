import StepDefinitions.RelationFieldSteps;
import StepDefinitions.TimeSlotSteps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {}, dryRun = false)
public class Run {
}
