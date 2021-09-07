package smoketests;

import base.DriverFactory;
import base.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ButtonPage;
import pageObjects.TextBoxPage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SmokeTest2
{
    //Calling WebDriver
    private WebDriver driver;

    //Creating TextPage object
    ButtonPage buttonPage;

    @BeforeTest
    public void setup() throws MalformedURLException {
        //driver = DriverFactory.getDriver(DriverType.CHROME);
        //Configuring Remote WebDriver
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName","Mac");
        driver = new RemoteWebDriver(new URL("http://192.168.1.68:4444/wd/hub"),chromeOptions);
        driver.get("https://www.demoqa.com/elements");
    }


    @Test
    public void TC002() throws InterruptedException, IOException {
        buttonPage = new ButtonPage(driver);
        buttonPage.clickButtonOption();
        Assert.assertTrue(this.buttonPage.isAt());
        buttonPage.clickingButtons();
        buttonPage.screenshot("buttonPagescreenshot",driver);
    }


    @AfterTest
    public void tearDown()
    {
        driver.close();
    }
}
