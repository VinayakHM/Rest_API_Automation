package RESTAPI.ExcelDriven;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import RestAPI.localServer.Files.payLoad;
import RestAPI.localServer.Files.reuseableMethods;

public class ExcelDriven {

	@Test
	public void addBook() {

		RestAssured.baseURI = "http://216.10.245.166";
		Response res = (Response) given().body(payLoad.addBook("584", "Hello")).when().post("/Library/Addbook.php")
				.then().assertThat().statusCode(200).extract().response();

		JsonPath j = reuseableMethods.rawToJson(res);
		String bookName = j.get("name");

		System.out.println(bookName);
	}
}

/* Sending parameter to Payload from Test */