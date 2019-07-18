package testngListeners;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ListnerTestClass {

	int i=1;

	@Test
	public void test1() {

	}

	@Test
	public void test2() {
		// Forcefully skipping this test
		throw new SkipException("I am Skipping this test");
	}

	@Test(successPercentage = 60, invocationCount = 5)
	public void test3() {
		i++;
		System.out.println("test3 test method, invocation count: " + i);
		if (i == 1 || i == 2) {
			System.out.println("test3 failed");
			Assert.assertEquals(i, 8);
		}
	}

}
