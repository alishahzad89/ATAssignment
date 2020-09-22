package main.java;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jayway.restassured.response.Response;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ResponseValidator {

	SoftAssert softAssert = new SoftAssert();
	public void validateProfileImage(Response response){
		JsonParser parser = new JsonParser();
		softAssert.assertEquals(response.getStatusCode(),Constants.HTTP_OK,"Validate status code");
		softAssert.assertAll(); //if status code is not valid exit
		JsonElement data = parser.parse(response.getBody().asString());
		JsonArray dataArray = data.getAsJsonObject().getAsJsonArray("data");

		for (int i = 0; i < dataArray.size() ; i++) {
			softAssert.assertEquals(dataArray.get(i).getAsJsonObject().get("profile_image").getAsString(),"","Validate image is empty");
		}
		softAssert.assertAll();

	}

	public void validateEmployeeData(Response response) {
		String [] keyArrays = {"id","employee_name","employee_salary","employee_age","profile_image"};
		Set<String> expectedKeys = new HashSet<String>(Arrays.asList(keyArrays));

		JsonParser parser = new JsonParser();
		softAssert.assertEquals(response.getStatusCode(),Constants.HTTP_OK,"Validate status code");
		softAssert.assertAll(); //if status code is not valid exit
		JsonElement data = parser.parse(response.getBody().asString());

		softAssert.assertEquals(data.getAsJsonObject().get("status").getAsString(),Constants.SUCCESS_STATUS,"Validate success status");
		softAssert.assertEquals(data.getAsJsonObject().get("message").getAsString(),Constants.SUCCESS_MESSAGE,"Validate success message");
		JsonObject  dataObject = data.getAsJsonObject().get("data").getAsJsonObject();
		softAssert.assertEquals(dataObject.keySet(),expectedKeys,"Validate key structure");
		softAssert.assertAll();

	}

}
