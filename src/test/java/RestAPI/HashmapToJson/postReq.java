package RestAPI.HashmapToJson;

import static com.jayway.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import RestAPI.localServer.Files.resouce;
import RestAPI.localServer.Files.reuseableMethods;

public class postReq {
	String proprtyLoc = "/home/vinayak/workspace/RestAPI/src/main/java/RestAPI/localServer/Files/environment.properties";

	public void getRequest() throws IOException {

		FileInputStream input = new FileInputStream(proprtyLoc);
		Properties prop = new Properties();
		prop.load(input);

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "4");
		map.put("title", "Hey HashMap");
		map.put("author", "Hey Json");

		RestAssured.baseURI = prop.getProperty("HOST");
		Response res = given().body(map).when().post(resouce.postResource()).then().assertThat().statusCode(201)
				.extract().response();
		System.out.println("........."+res.asString());

		JsonPath j = reuseableMethods.rawToJson(res);
		System.out.println("id is : " + j.get("id"));
		Response getRes = given().when().get(resouce.getResource());

		System.out.println("get response is : " + getRes.asString());
	}

}
