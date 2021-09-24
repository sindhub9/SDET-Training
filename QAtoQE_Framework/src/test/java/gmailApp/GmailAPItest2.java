/*package gmailApp;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GmailAPITest
{
    String accessToken = "Bearer ya29.a0ARrdaM8cAlCqDBscBjb3xpsAf18Dv81UoaQ3OuJFeCAaLzyg8UFMHgjgBh6jjxFLVCmZhEmB030KTi0xi0m6IIG_Qsi7FJ78e2OUav_wuQmsGl1gCrLZEURGo2rJ0sU7vHDzfc0t9q751oO0OToxNFQ6McLz";
    @Test
    public void gmailAPITest()
    {
        String msg = "From: appbana9@gmail.com\n" +
                "To: appbana9@gmail.com\n" +
                "Subject: Test Email from Rest Assutred\n" +
                "\n" +
                "Sending from Gmail API";

        String base64URLencoded = Base64.getUrlEncoder().encodeToString(msg.getBytes());

        Map<String,String> payLoad = new HashMap<>();
        payLoad.put("raw",base64URLencoded);

        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .header("Authorization",accessToken)
                .body(payLoad)
                .post("https://gmail.googleapis.com/gmail/v1/users/appbana9@gmail.com/messages/send");


        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    }
}*/
