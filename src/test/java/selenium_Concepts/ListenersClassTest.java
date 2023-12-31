package selenium_Concepts;

import java.util.List;

import org.testng.IMethodInstance;
import org.testng.annotations.*;

//@Listeners(ListenersClass.class) // We can user @Listeners anno at test class level or in the .xml file after suite tag & before tests tag
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
