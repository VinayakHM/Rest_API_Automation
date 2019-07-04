package RestAPI.localServer.requestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import RestAPI.localServer.Files.*;


import static com.jayway.restassured.RestAssured.given;


public class postRequest {
	
	String proprtyLoc = "/home/vinayak/workspace/RestAPI/src/main/java/RestAPI/localServer/Files/environment.properties";
	
	public void getRequest() throws IOException{
		
		FileInputStream input = new FileInputStream(proprtyLoc);
		Properties prop = new Properties();
		prop.load(input);
		
		RestAssured.baseURI=prop.getProperty("HOST");
		Response res = given().body(payLoad.postBody()).when().post(resouce.postResource()).then().assertThat().statusCode(201).extract().response();
		
		
		JsonPath j= reuseableMethods.rawToJson(res);
		System.out.println("id is : "+j.get("id"));
		Response getRes = given().when().get(resouce.getResource());
		
		System.out.println("get response is : "+getRes.asString());
	}

}
