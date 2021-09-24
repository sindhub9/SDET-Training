package Smoketests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        strict = true,
        features = "src/main/resources/features/buttonPage.feature",
        plugin ={"pretty","html:target/sie/cucumber-pretty","json:target/cucumber/cucumber.json"},
        glue = {"stepDefinations"},
        //plugin ={"pretty","html:target/cucumber-reports"},

        tags={"@sanityTest"},
        monochrome = true
)

public class cucumberRunnerTest extends AbstractTestNGCucumberTests
{

}
