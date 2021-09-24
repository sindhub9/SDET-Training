package Smoketests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        strict = true,
        features = "src/main/resources/features/reqresAPI.feature",

        glue = {"stepDefinations"},
        plugin ={"pretty","html:target/cucumber-reports"},

        tags={"@smokeAPI"},
        monochrome = true
)

public class cucumberRunner extends AbstractTestNGCucumberTests
{

}
