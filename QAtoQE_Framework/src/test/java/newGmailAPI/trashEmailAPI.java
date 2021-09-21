package newGmailAPI;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class trashEmailAPI
{

        String accessToken = "Bearer ya29.a0ARrdaM_TWkIi1LL3obfhIxFS-cdByL7G2OykauRade7BmYxk6igD4caXKJoo4tsvkzyAdP-sOgOKKMSU8c82je6x_OpPd-3bT9pQUxEFOLH8gG88Dvf3LeH5hUp8VZnvD1ZeZcIaa6SUZmt82FIfEMBlHJbC";

        @Test
        public void trashEmail() {


            Response response = given()
                    .when()
                    .header("Content-Type", "application/json")
                    .header("Authorization", accessToken)
                    .post("https://gmail.googleapis.com/gmail/v1/users/sdetqatoqe9@gmail.com/messages/17c0477e9d4daa42/trash");


            String responseBody = response.getBody().asString();
            System.out.println(responseBody);
        }


}
