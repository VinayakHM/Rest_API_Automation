package RestAPI.localServer.Files;

public class payLoad {

	public static String postBody() {
		String body = "{\"id\":\"3\"," + " \"title\":\"hehencncndci\"," + " \"author\":\"ABCDEF\" }";
		return body;
	}

	public static String postBody2() {
		String body = "{" + "\"id\": 11," + "\"title\": \"kfdf\"," + "\"author\": \"kjd\"" + "}";
		return body;
	}

	public static String addBook(String isbn, String aisle) {

		String body = "{\r\n\r\n\"name\":\"Data Structure\",\r\n\"isbn\":\""+isbn+"\",\r\n\"aisle\":\""+aisle+"\",\r\n\"author\":\"vinayak HM\"\r\n}\r\n \r\n";
		return body;
	}
}
