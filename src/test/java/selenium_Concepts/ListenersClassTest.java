package selenium_Concepts;

import org.testng.annotations.*;

public class ListenersClassTest {
	
	@BeforeSuite
	public void setUpSuite() {
		System.out.println("Before suite in test class");
	}
	
	@AfterSuite
	public void tearDownSuite() {
		System.out.println("After suite in test class");
	}
	
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("Before method in test class");
	}
	
	@AfterMethod
	public void tearDownMethd() {
		System.out.println("After method in test class");
	}
	
	@Test
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	
	@Test
	public void launchportal() {
		System.out.println("launchportal");
	}
	
	@Test
	public void verifyLogo() {
		System.out.println("verifyLogo");
	}

}
