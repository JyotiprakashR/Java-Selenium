package testNG_Concepts;

import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ITestContextInterfaceConcept {

	// using this interface testNG flows all the detail from .xml file to all the
	// test classes/@annotations methods
	@BeforeTest
	public void setUp(ITestContext iTestContext) {
		iTestContext.setAttribute("browser", "chrome");
	}

	@Test
	public void test(ITestContext iTestContext) {
		String browserName = (String) iTestContext.getAttribute("browser");
		System.out.println("Browser Name :" + browserName);
	}

	// to read/retrieve .xml file parameter values
	@BeforeClass
	public void beforeClass(ITestContext context) {
		String value = context.getCurrentXmlTest().getParameter("browser");
		System.err.println("browser = " + value);
		String value1 = context.getCurrentXmlTest().getParameter("browserHeadlessFlag");
		System.err.println("browserHeadlessFlag = " + value1);

		Map<String, String> allParam = context.getCurrentXmlTest().getAllParameters();

	}

}
