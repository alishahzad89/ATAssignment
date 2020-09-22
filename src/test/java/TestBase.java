package test.java;

import com.jayway.restassured.response.Response;
import main.java.*;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class TestBase {

    protected SoftAssert softAssert;
    protected APIUrl apiUrl;
    protected Response response;
    protected ResponseValidator responseValidator;

    protected static String baseURL;
    protected Map<String, String> testData;
    @BeforeSuite
    public void initialize() throws CustomException {
        Helper helper = new Helper();
        helper.readPropertyFile("config.properties");
        Configuration configuration = new Configuration(helper.readPropertyFile("config.properties"));
        baseURL = configuration.getBaseURL();
        System.out.println(baseURL);
    }
}
