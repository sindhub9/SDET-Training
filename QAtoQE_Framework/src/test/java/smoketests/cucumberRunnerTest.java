package Smoketests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        strict = true,
        features = "src/main/resources/features/reqresAPI.feature",
        plugin ={"pretty","html:target/sie/cucumber-pretty","json:target/cucumber/cucumber.json"},
        glue = {"stepDefinations"},
        //plugin ={"pretty","html:target/cucumber-reports"},

        tags={"@smokeAPI"},
        monochrome = true
)

public class cucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
