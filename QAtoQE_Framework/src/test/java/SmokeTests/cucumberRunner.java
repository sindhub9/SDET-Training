package SmokeTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        strict = true,
        features = "src/main/resources/features",

        glue = {"stepDefinations"},
        plugin ={"pretty","html:target/cucumber-reports"},

        tags={"@smokeTest"},
        monochrome = true
)

public class cucumberRunner extends AbstractTestNGCucumberTests
{

}
