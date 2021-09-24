package SmokeTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static io.restassured.RestAssured.given;

public class smokeAPITask1
{
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
        htmlReporter = new ExtentHtmlReporter("target/QAtoQE_Report1.html");

        htmlReporter.setAppendExisting(true);


        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        //log4j log
        logger.warn("Testing API application");

        // creates a toggle for the given test, adds all log events under it
        test = extent.createTest("Smoke API Test1", "Testing API application");


    }
    @Test(priority=3)
    public  void getCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Retrieving single user using GET call");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .get("https://reqres.in/api/users/2");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        logger.info("Successfully retrieved the  user ");

        test.log(Status.PASS, "Successfully retrieved the  user");

    }

    @Test (priority=0)
    public  void postCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Creating the user using POST Call");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").post("https://reqres.in/api/users");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        logger.info("Successfully created the  user ");

        test.log(Status.PASS, "Successfully created the  user");

    }

    @Test(priority=1)
    public  void putCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Update the record using PUT Call");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}").put("https://reqres.in/api/users/2");

        String responseBody = response.getBody().asString();

        System.out.println("Status code for put API call" +response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),200);

        System.out.println(responseBody);

        logger.info("Successfully updated the  user ");

        test.log(Status.PASS, "Successfully updated the  user");


    }

    @Test(priority=2)
    public  void deleteCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Delete a record using DELETE Call");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .delete("https://reqres.in/api/users/2");


        System.out.println("Status code for delete API call " + response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),204);

        logger.info("Successfully deleted ");

        test.log(Status.PASS, "Successfully deleted");



    }

    @AfterMethod
    public void tearDown()
    {
        extent.flush();

    }
}

