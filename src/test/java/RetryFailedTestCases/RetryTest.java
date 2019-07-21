package RetryFailedTestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryTest {

	@Test
	public void test1() {
		System.out.println("retrying");
		Assert.assertTrue(false);
	}

}
