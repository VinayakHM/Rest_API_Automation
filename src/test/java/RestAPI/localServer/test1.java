package RestAPI.localServer;

import java.io.IOException;

import org.testng.annotations.Test;

import RestAPI.localServer.requestClass.postRequest;

public class test1 {
	
	@Test
	public void test() throws IOException{
		postRequest request = new postRequest();
		request.getRequest();

	}

}
