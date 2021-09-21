
package stepDefinations;

import base.driverFactory;
import base.driverType;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import pageObject.textBoxPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class textBoxSteps
{
    //Calling web driver
    private WebDriver driver;

    //Creating objects for pages
    textBoxPage textboxpage;

    @Given("I opened the  browser")
    public void iOpenedTheBrowser()
    {
        driver = driverFactory.getDriver(driverType.CHROME);
    }

    @And("I am navigating into the textbox application")
    public void iAmNavigatingIntoTheTextboxApplication() throws IOException
    {
        textboxpage=new textBoxPage(this.driver);
        String url = textboxpage.getProperties1("url");
        driver.get(url);
    }



    @When("I click on the textbox option$")
    public void iClickonTextboxOption()
    {
        textboxpage = new textBoxPage(driver);
        this.textboxpage.clickTextButton();
        this.textboxpage.isAt();
    }

    @And("I enter all  the text box details with (.*) and  take the screenshot as (.*)$")
    public void iEnterAllTheDetails(String email,String screenShotName) throws IOException
    {
        textboxpage.enterDetails(email);
        textboxpage.screenshot(screenShotName, driver);

    }


    @Then("I quit the textbox application")
    public void iQuitTheTextboxApplication()
    {
        driver.close();
    }


    @And("I am navigating to the application")
    public void iAmNavigatingToTheApplication(DataTable dataTable)
    {
        List<String> tbl =  dataTable.asList();
        String URL = tbl.get(0);
        driver.get(URL);
        
    }

    @And("I am navigating to the application with headers")
    public void iAmNavigatingToTheApplicationWithHeaders(DataTable dataTable)
    {
        List<Map<String ,String>> listTbl = dataTable.asMaps();

        for(Map<String ,String> valTbl:listTbl)
        {
            String URL = valTbl.get("URL");
            driver.get(URL);
        }
    }


}

