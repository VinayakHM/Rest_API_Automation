package RetryFailedTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class RetryTest {

	@Test
	public void test1() {
		System.out.println("retrying");
		AssertJUnit.assertTrue(false);
	}

}
