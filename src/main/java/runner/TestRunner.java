package runner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/java/feature"
 ,glue={"stepDefinition"}
 ,plugin={"html:target/html/ExtentReport.html"}
 ,dryRun=false
 )



public class TestRunner {

}
