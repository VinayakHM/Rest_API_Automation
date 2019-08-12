package TestNG.Tutorial1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeClass
	public void cla(){
		System.out.println("");
	}
	
	@BeforeSuite
	public void suiteWillFirstPriority(){
		System.out.println("BeforeSuite : Suite will be the first priority");
	}
	
	@BeforeMethod
	public void beforeEachTest(){
		System.out.println("BeforeMethod : Execute Before Each Test Method");
	}
	
	@AfterMethod
	public void afterEachTest(){
		System.out.println("AfterMethod : Execute After Each Test Method");
	}
	
	@AfterSuite
	public void suiteWillLast(){
		System.out.println("AfterSuite : Suite will execute after all test");
	}
	
	@BeforeTest
	public void runBeforTest(){
		System.out.println("BeforeTest : It will run the Before any test");
	}
	@Test
	public void testCase1(){
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2(){
		System.out.println("Test case 2");
	}
	
	@AfterTest
	public void afterTestMethods(){
		System.out.println("AfterTest : This will Run after all Test Execution");
	}

}
