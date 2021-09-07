package stepDefintions;

import base.DriverFactory;
import base.DriverType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.TextBoxPage;

import java.io.IOException;

public class TextBoxSteps
{
    //Calling WebDriver
    private WebDriver driver;

    //Creating TextPage object
    TextBoxPage textBoxPage;

    @Given("^I am navigating to the (.*)$")
    public void navigatingtextBoxApplication(String URI)
    {
        driver = DriverFactory.getDriver(DriverType.CHROME);
        driver.get(URI);
    }

    @When("^I click on textbox option$")
    public void clickingTextboxOption()
    {
        textBoxPage = new TextBoxPage(driver);
        this.textBoxPage.clickTextButton();
        Assert.assertTrue(this.textBoxPage.isAt());
    }

    @And("^I enter all the textbox details with (.*) and take screenshot as (.*)$")
    public void textBoxDetails(String email, String screenshotName) throws InterruptedException, IOException {

        textBoxPage.enterDetails(email);
        textBoxPage.screenshot(screenshotName,driver);
    }

    @Then("^I quit the application$")
    public void quitApplication()
    {
        driver.close();
    }
}
