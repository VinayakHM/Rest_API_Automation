package testPackage;

import static com.jayway.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import RestAPI.localServer.Files.reuseableMethods;

public class check1 {
	@Test
	public void getRequest() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("", "");
		map.put("", "");
		RestAssured.baseURI = "http://dummy.restapiexample.com/";
		Response res = given().when().get("api/v1/employees").then().extract().response();

		JsonPath j = reuseableMethods.rawToJson(res);
		System.out.println(j.get("employee_name"));
	}

}
