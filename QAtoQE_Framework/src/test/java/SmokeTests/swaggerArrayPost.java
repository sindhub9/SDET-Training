package SmokeTests;

import com.github.javafaker.Faker;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.swaggerPostToOrderPet.arrayRoot;
import pojos.swaggerPostToOrderPet.parameters;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class swaggerArrayPost
{
    arrayRoot arrayroot;
    parameters parameter;
    Faker faker;

    @Test(priority = 0)
    public void swaggerarrayPost()
    {
        //Creating objects for arrayRoot and parameters
        arrayroot = new arrayRoot();
        parameter = new parameters();

        faker = new Faker();

        //Creating List for parameters class
        List<parameters> parametersList = new ArrayList<>();
        parametersList.add(parameter);

        //Setting the values
        /*parameter.setId(100);
        parameter.setEmail("abc");
        parameter.setFirstName("string");
        parameter.setLastName("string");
        parameter.setPhone("string");
        parameter.setUserStatus(9);
        parameter.setUsername("string");
        parameter.setPassword("string");*/

        //Setting values using faker
        parameter.setId(100);
        parameter.setEmail(faker.internet().emailAddress());
        parameter.setFirstName(faker.name().firstName());
        parameter.setLastName(faker.name().lastName());
        parameter.setPhone(faker.phoneNumber().cellPhone());
        parameter.setUserStatus(9);
        parameter.setUsername(faker.name().username());
        parameter.setPassword(faker.internet().password());

        //Setting values for arrayRoot
        arrayroot.setParametersList(parametersList);



        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body(arrayroot.getParametersList())
                .post("https://petstore.swagger.io/v2/user/createWithArray");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);


    }


}
