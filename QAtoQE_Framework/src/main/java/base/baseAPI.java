package base;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


import java.io.IOException;

public class baseAPI
{

    fileReaderManager filereader;

    @BeforeClass
    public void base() throws IOException
    {
        filereader = new fileReaderManager();
        RestAssured.baseURI = filereader.getProperties("baseURI");
    }




}
