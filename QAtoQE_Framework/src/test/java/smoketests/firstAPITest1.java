package Smoketests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class firstAPItest1
{
    @Test(priority=0)
    public  void getCall()
     {
         Response response = given()
                             .when()
                             .header("Content-Type","application/json")
                             .get("https://reqres.in/api/users/2");

         String responseBody = response.getBody().asString();
         System.out.println(responseBody);

     }

    @Test(priority=1)
    public  void getCallforListofusers()
    {
        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .get("https://reqres.in/api/users?page=2");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }

    @Test (priority=2)
    public  void postCall()
    {
        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").post("https://reqres.in/api/users");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }
    @Test (priority=3)
    public  void postCallforlogin()
    {
        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}").post("https://reqres.in/api/login");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }

    @Test(priority=4)
    public  void putCall()
    {
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

    }

    @Test(priority=5)
    public  void deleteCall()
    {
        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .delete("https://reqres.in/api/users/2");


        System.out.println("Status code for delete API call " + response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),204);



    }



}
