package stepDefinations;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.testng.Assert;
import pojos.postPojo;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reqresAPISteps
{
    Response response;
    postPojo pPojo;

    @Given("I am baseURI of the reqres application")
    public void iAmBaseURIOfTheApplication()
    {
        RestAssured.baseURI="https://reqres.in";
    }

    @When("I passing endpoints for  single user")
    public void iPassingEndpointsForSingleUser()
    {
        response = given()
                .when()
                .header("Content-Type","application/json")
                .get("/api/users/2");


    }

    @When("I passing endpoints for  list user")
    public void iPassingEndpointsForListUser()
    {
        response = given()
                .when()
                .header("Content-Type","application/json")
                .get("/api/users?page=2");
    }

    @When("I passing endpoints to create")
    public void iPassingEndpointsToCreate()
    {
        pPojo= new postPojo();
        pPojo.setName("morpheus");
        pPojo.setJob("leader");


        response = given()
                .when()
                .header("Content-Type","application/json")
                .body(pPojo).post("/api/users");
    }

    @When("I passing endpoints for  login user")
    public void iPassingEndpointsForLoginUser()
    {
        pPojo= new postPojo();
        pPojo.setEmail("eve.holt@reqres.in");
        pPojo.setPassword("cityslicka");

         response = given()
                .when()
                .header("Content-Type","application/json")
                .body(pPojo).post("/api/login");

    }

    @When("I passing endpoints to update")
    public void iPassingEndpointsToUpdate()
    {

        /*Map<String, String> bodyParam = new HashMap<>();
        bodyParam.put("name", "morpheus");
        bodyParam.put("job", "zion resident");*/
        pPojo= new postPojo();
        pPojo.setName("morpheus");
        pPojo.setJob("zion resident");


        response = given()
                .when()
                .header("Content-Type", "application/json")
                .body(pPojo).put("/api/users/2");
    }

        @When("I passing endpoints to delete")
    public void iPassingEndpointsToDelete()
    {
         response = given()
                .when()
                .header("Content-Type","application/json")
                .delete("/api/users/2");
    }

    @Then("^I validate the status code as (.*)$")
    public void iValidateTheStatusCode(int exp_statusCode)
    {
        Assert.assertEquals(response.getStatusCode(),exp_statusCode);
    }

    @And("^I validate email as (.*)$")
    public void iValidateEmailAsJanetWeaverReqresIn(String expected_emailValue)
    {
        String responseBody = response.getBody().asString();

        String actual_emailValue = JsonPath.read(responseBody,"$.data.email");

        Assert.assertEquals(actual_emailValue,expected_emailValue);
    }

    @And("^I validate job as (.*)$")
    public void iValidateJobAsZionResident(String expected_job)
    {
        String responseBody = response.getBody().asString();

        String actual_job = JsonPath.read(responseBody,"$.job");

        Assert.assertEquals(actual_job,expected_job);
    }


}
