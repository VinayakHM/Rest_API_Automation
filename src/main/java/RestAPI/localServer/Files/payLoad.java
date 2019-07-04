package RestAPI.localServer.Files;

public class payLoad {

	public static String postBody() {
		String body = "{\"id\":\"3\"," + " \"title\":\"hehencncndci\"," + " \"author\":\"ABCDEF\" }";
		return body;
	}

	
	
	public static String postBody2() {
		String body = "{"+
        "\"id\": 11,"+
        "\"title\": \"kfdf\","+
        "\"author\": \"kjd\""+
    "}";
		return body;
	}
}
