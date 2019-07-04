package RestAPI.localServer.Files;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.response.Response;

public class reuseableMethods {

	public static JsonPath rawToJson(Response r) {
		String respAsString = r.asString();
		JsonPath js = new JsonPath(respAsString);
		return js;
	}

	public static XmlPath rawToXml(Response r) {
		String respAsString = r.asString();
		XmlPath xml = new XmlPath(respAsString);
		return xml;
	}

}
