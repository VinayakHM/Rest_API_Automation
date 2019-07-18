package testngListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerInTestNG implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("All test finished");
		Reporter.log("All test finished");
	}

	public void onStart(ITestContext arg0) {
		System.out.println("test execution started");
		Reporter.log("test started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("test is pass based on percentage" + getMethodName(arg0));
		Reporter.log("test failed"+ getMethodName(arg0));
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("test failed " + getMethodName(arg0));
		Reporter.log("test failed"+ getMethodName(arg0));
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("test skipped" + getMethodName(arg0));
		Reporter.log("test skipped"+ getMethodName(arg0));
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("test is pass based on percentage" + getMethodName(arg0));
		Reporter.log("test started"+ getMethodName(arg0));
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test is passed " + getMethodName(arg0));
		Reporter.log("test Success"+ getMethodName(arg0));
	}

	private static String getMethodName(ITestResult arg0) {
		return arg0.getMethod().getConstructorOrMethod().getName();

	}

}
