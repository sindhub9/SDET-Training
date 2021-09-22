package SmokeTests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class swaggerPostTaskChaining
{
   @Test(priority = 0)
    public void swagger()
   {
       Response response = given()
               .when()
               .header("Content-Type","application/json")
               .get("https://petstore.swagger.io/v2/pet/9223372036854776000");

       String responseBody = response.getBody().asString();
       System.out.println(responseBody);

       Assert.assertEquals(response.getStatusCode(),404);
       System.out.println(response.getStatusCode());

   }
}
