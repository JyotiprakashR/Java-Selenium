package selenium_Concepts;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Before suite in listener");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("After suite in listener");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Before Method in listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("After Method in listener---pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("After Method in listener---fail & attaching screenshot here");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("After Method in listener---skiped & ignored");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Before Test in listener");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("After test in listener");
	}

}
