package RESTAPI.ExcelDriven;

import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import RestAPI.localServer.Files.payLoad;
import RestAPI.localServer.Files.reuseableMethods;

public class staticJson {

	@Test
	public void addBook() throws IOException {

		RestAssured.baseURI = "http://216.10.245.166";
		Response res = (Response) given().body(GenerateStringFromResource("/home/vinayak/workspace/RestAPI/Files/addBookDetails.json")).when().post("/Library/Addbook.php")
				.then().assertThat().statusCode(200).extract().response();
		JsonPath j = reuseableMethods.rawToJson(res);
		String bookName = j.get("name");
		System.out.println(bookName);
	}

	public static String GenerateStringFromResource(String Path) throws IOException {
		return new String(Files.readAllBytes(Paths.get(Path)));
	}

}
