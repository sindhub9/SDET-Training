package Smoketests;

import base.driverFactory;
import base.driverType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.textBoxPage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class smoketest1 {

    //Calling web driver
    private WebDriver driver;

    //Creating objects for pages
    textBoxPage textboxpage;

    //Objects for Extent Reporters
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;

    //Object for log4j
   Logger logger= Logger.getLogger(smoketest1.class);

    @BeforeTest
    public void setUp() throws MalformedURLException
    {
PropertyConfigurator.configure("src/main/resources/properties/log4j.properties");
        // start reporters
        htmlReporter = new ExtentHtmlReporter("target/QAtoQE_Report.html");

        htmlReporter.setAppendExisting(true);


        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        //log4j log
        logger.warn("Testing textbox module");

        // creates a toggle for the given test, adds all log events under it
        test = extent.createTest("Smoke Test1", "Testing textbox module");

        driver = driverFactory.getDriver(driverType.CHROME);

        logger.warn("Navigating to the url");
        test.log(Status.INFO, "Navigating to the url");
        driver.get("https://demoqa.com/elements");
    }

    @Test
    private void TC001() throws IOException {

        // log(Status, details)
        test.log(Status.INFO, "Navigating to textbox module");

        textboxpage = new textBoxPage(driver);
        this.textboxpage.clickTextButton();

        logger.info("User navigated to textbox module successfully");

        test.log(Status.PASS, "User Navigated to textbox module successfully");
        //this.textboxpage.isAt();
        Assert.assertTrue(this.textboxpage.isAt());


        test.log(Status.INFO, "Entering details in to textbox module");
        textboxpage.enterDetails("test@gmail.com");
        //Assert.assertTrue(false);
        test.log(Status.PASS, "User entered the deails in to textbox module successfully");
        textboxpage.screenshot("textboxscreenshot", driver);

        extent.flush();
        driver.close();

    }


    @AfterMethod
    public void screenShot(ITestResult result)
    {

        if (ITestResult.FAILURE == result.getStatus())
        {
            try
            {
                // To create reference of TakesScreenshot
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                // Call method to capture screenshot

                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destFile = new File("target/" + result.getName() + ".png");
                FileUtils.copyFile(src, destFile);

                String path = "/QAtoQE_Framework/target/" + result.getName() + ".png";

                test.log(Status.FAIL, "<a href='" + path + "'> <img src='" + path + "' height='100' width='100'/> </a>");
                extent.flush();
                driver.close();
            }
            catch (Exception e)
            {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }

    /*@AfterMethod
    public void tearDown(ITestResult result) throws IOException
    {
        if(result.getStatus()==ITestResult.FAILURE)
            {
            String fileName= utility.getScreenshot(this.driver);
            test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(fileName).build());
            }

        extent.flush();
        driver.close();
    }*/


        }
    }
}