package Smoketests;

import base.baseAPI;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojos.postPojo;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class smokeAPITest2 extends baseAPI
{
    //Objects for Extent Reporters
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;

    //Object for log4j
    Logger logger= Logger.getLogger(smoketest1.class);

    //pojo object
    postPojo pPojo;

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
    @Test(priority=0)
    public  void getCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Retrieving single user using GET call");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .get("/api/users/2");

        String responseBody = response.getBody().asString();

        String emailValue = JsonPath.read(responseBody,"$.data.email");


        String supportURL = JsonPath.read(responseBody,"$.support.url");

        Assert.assertEquals(emailValue,"janet.weaver@reqres.in");

        Assert.assertEquals(supportURL,"https://reqres.in/#support-heading");


       // System.out.println(responseBody);
        System.out.println("Status code for put API call" +response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),200);

        logger.info("Successfully retrieved the  user ");

        test.log(Status.PASS, "Successfully retrieved the  user");

    }

    @Test (priority=1)
    public  void postCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Creating the user using POST Call");

        pPojo= new postPojo();
        pPojo.setName("morpheus");
        pPojo.setJob("leader");


        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body(pPojo).post("/api/users");

        String responseBody = response.getBody().asString();

        String nameValue = JsonPath.read(responseBody,"$.name");

        //System.out.println(responseBody);
        Assert.assertEquals(nameValue,"morpheus");

        System.out.println("Status code for post API call" +response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),201);

        logger.info("Successfully created the  user ");

        test.log(Status.PASS, "Successfully created the  user");

    }

    @Test(priority=2)
    public  void putCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Update the record using PUT Call");

        Map<String,String> bodyParam = new HashMap<>();
        bodyParam.put("name","morpheus");
        bodyParam.put("job","zion resident");


        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body(bodyParam).put("/api/users/2");

        String responseBody = response.getBody().asString();

        System.out.println("Status code for put API call" +response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),200);

        System.out.println(responseBody);

        logger.info("Successfully updated the  user ");

        test.log(Status.PASS, "Successfully updated the  user");


    }

    @Test(priority=3)
    public  void deleteCall()
    {
        // log(Status, details)
        test.log(Status.INFO, "Delete a record using DELETE Call");

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .delete("/api/users/2");


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
