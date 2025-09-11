package Listeners;

import io.cucumber.testng.PickleWrapper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	String methodName = null;

	public void onTestStart(ITestResult result) {
		
		// Fetch scenario name if available
		Object[] params = result.getParameters();
		if (params.length > 0 && params[0] instanceof PickleWrapper) {
			PickleWrapper pickle = (PickleWrapper) params[0];
			methodName = pickle.getPickle().getName(); // scenario name
		}

		System.out.println("------------Listerner: Test Started------------" + methodName);

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("--------Listener: Test Passed Successfully---------" + methodName);
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("--------Listener: !!!!! Test Failed !!!!!!--------" + methodName);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("------Listener: Test Skipped-------" + methodName);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("------Listener: Test Failed due to timeout issue-------" + methodName);
	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
