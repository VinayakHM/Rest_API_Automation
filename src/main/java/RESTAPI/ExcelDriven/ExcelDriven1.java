package RESTAPI.ExcelDriven;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import RestAPI.localServer.Files.payLoad;
import RestAPI.localServer.Files.reuseableMethods;

public class ExcelDriven1 {

	@Test(dataProvider = "BookData")
	public void addBook(String isb, String aisl) {

		RestAssured.baseURI = "http://216.10.245.166";
		Response res = (Response) given().body(payLoad.addBook(isb, aisl)).when().post("/Library/Addbook.php").then()
				.assertThat().statusCode(200).extract().response();
		JsonPath j = reuseableMethods.rawToJson(res);
		String bookName = j.get("name");
		System.out.println(bookName);
	}

	@DataProvider(name = "BookData")
	public Object[][] getData() {
		return new Object[][] { { "845", "AAA" }, { "945", "BBB" }, { "745", "CCC" } };
	}

}
