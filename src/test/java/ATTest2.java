package test.java;

import com.jayway.restassured.response.Response;
import main.java.APIUrl;
import main.java.DataReader;
import main.java.ResponseValidator;
import main.java.RestUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

public class ATTest2 extends TestBase {

	@BeforeTest
	public void beforeTest(){
		apiUrl = new APIUrl(baseURL);
		responseValidator = new ResponseValidator();
	}
	@Test(description = "To pick the Request Data from external file")
	public void testScenarioTwoEmployee2() throws Exception {
		testData = DataReader.readData("testdata.json", "Employee2");
		response =RestUtil.get(apiUrl.employeeURL + testData.get("id"));
		responseValidator.validateEmployeeData(response);
	}

	@Test(description = "To pick the Request Data from external file")
	public void testScenarioTwoEmployee3() throws Exception {
		testData = DataReader.readData("testdata.json", "Employee3");
		response =RestUtil.get(apiUrl.employeeURL + testData.get("id"));
		responseValidator.validateEmployeeData(response);
	}
}
