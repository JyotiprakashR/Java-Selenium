package selenium_Concepts;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenersClass implements ITestListener, ISuiteListener 
{

	// also we can use this class--TestListenerAdapter which also implemts all the above interfaces
	
	@Override
	public void onStart(ISuite suite) {
		System.out.println("@BeforeSuite in listener");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("@BeforeTest in listener");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("@BeforeMethod in listener");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("@AfterMethod in listener---pass");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("@AfterTest in listener");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("@AfterSuite in listener");
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

	

}
