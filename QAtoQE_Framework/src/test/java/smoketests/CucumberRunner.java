package smoketests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"src/main/java/stepDefintions"},
//        tags = {"@SmokeTest"},
        plugin = {"pretty","html:target/cucumber-reports"},
        monochrome = true
)
public class CucumberRunner extends AbstractTestNGCucumberTests
{

}
