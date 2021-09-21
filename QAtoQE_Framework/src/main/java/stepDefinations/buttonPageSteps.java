package stepDefinations;

import base.driverFactory;
import base.driverType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.buttonPage;

import java.io.IOException;

public class buttonPageSteps
{
    //Calling web driver
    private WebDriver driver;

    //Creating objects for page

    buttonPage buttonpage;


    @Given("^I am navigating into button page application$")
    public void navigatingButtonPageApplication()
    {
        driver = driverFactory.getDriver(driverType.CHROME);
        driver.get("https://demoqa.com/elements");
    }

    @When("I click on button option")
    public void iClickOnButtonOption() throws InterruptedException {
        buttonpage = new buttonPage(driver);
        buttonpage.clickButtonOption();
        this.buttonpage.isAt();
    }

    @And("I click all the buttons")
    public void iClickAllTheButtons() throws IOException {
        buttonpage.clickButtons();

        buttonpage.screenshot("buttonpagescreenshot",driver);

    }


    @Then("I quit the button  page application")
    public void iQuitTheButtonPageApplication()
    {
        driver.close();
    }

}
