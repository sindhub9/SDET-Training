package SmokeTests;


import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.swaggerPostToAddPet.Categeory;
import pojos.swaggerPostToAddPet.Tags;
import pojos.swaggerPostToAddPet.rootSwag;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;



public class swaggerPost
{
    Categeory categeory;
    Tags tags;
    rootSwag rootswag;

    @Test()
    public void swaggerPost1()
    {

     //Creating objects for categeory,rootSwag and tags
      categeory = new Categeory();
      tags = new Tags();
      rootswag = new rootSwag();

      //Creating List for Tags
      List<Tags> listTags = new ArrayList<>();
      listTags.add(tags);

      //Creating List for photoUrls
      List<String> listPhoto = new ArrayList<>();
      listPhoto.add("String");

      //Setting values for categeory class
       categeory.setId(100);
       categeory.setName("dog");

        //Setting values for Tags class
        tags.setId(200);
        tags.setName("dogpop");

      //Setting values for root values
      rootswag.setCategeory(categeory);
      rootswag.setTags(listTags);
      rootswag.setPhotoUrls(listPhoto);
      rootswag.setStatus("available");
      rootswag.setId(500);
      rootswag.setName("pup");





        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .body(rootswag)
                .post("https://petstore.swagger.io/v2/pet");


        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        int idValue = JsonPath.read(responseBody,"$.id");
        System.out.println("Id value :" + idValue);


    }

}
