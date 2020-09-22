package test.java;

import com.jayway.restassured.response.Response;
import main.java.APIUrl;
import main.java.ResponseValidator;
import main.java.RestUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ATTest extends TestBase {


	@BeforeTest
	public void beforeTest(){
		apiUrl = new APIUrl(baseURL);
		responseValidator = new ResponseValidator();
	}
	@Test(description = "To pick the API link from config file")
	public void testScenarioOne() throws Exception {
		response =RestUtil.get(apiUrl.employeesURL);
		responseValidator.validateProfileImage(response);
	}
}
