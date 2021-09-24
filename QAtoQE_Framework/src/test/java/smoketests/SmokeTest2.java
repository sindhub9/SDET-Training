package Smoketests;

import base.driverFactory;
import base.driverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.buttonPage;

import java.io.IOException;
import java.net.MalformedURLException;

public class smoketest2
{
    //Calling web driver
    private WebDriver driver;

    //Creating objects for page

    buttonPage buttonpage;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        driver = driverFactory.getDriver(driverType.CHROME);

        //Configuring remote webdriver
        // ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setCapability("platformName","Mac");
        //driver = new RemoteWebDriver(new URL("http://192.168.0.213:4444/wd/hub"),chromeOptions);

        driver.get("https://demoqa.com/elements");
    }
    @Test
    private void TC001() throws IOException {



        buttonpage = new buttonPage(driver);
       buttonpage.clickButtonOption();
        this.buttonpage.isAt();
        buttonpage.clickButtons();

        buttonpage.screenshot("buttonpagescreenshot",driver);

    }

    @AfterTest
    public void tearDown()

    {
        driver.close();
    }



}
