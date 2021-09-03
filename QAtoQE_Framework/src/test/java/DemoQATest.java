import base.DriverFactory;
import base.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ButtonPage;
import pageObjects.TextBoxPage;

import java.util.concurrent.TimeUnit;

public class DemoQATest
{
    //Calling WebDriver
    private WebDriver driver;

    //Creating TextPage object
    TextBoxPage textBoxPage;
    ButtonPage buttonPage;

    @BeforeTest
    public void setup()
    {
        driver = DriverFactory.getDriver(DriverType.CHROME);
    }

    @Test
    public void TC001() throws InterruptedException {
        driver.get("https://www.demoqa.com/elements");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        textBoxPage = new TextBoxPage(driver);
        textBoxPage.enterDetails();
    }

    @Test(dependsOnMethods = "TC001")
    public void TC002() throws InterruptedException {
        buttonPage = new ButtonPage(driver);
        buttonPage.clickingButtons();
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }
}
