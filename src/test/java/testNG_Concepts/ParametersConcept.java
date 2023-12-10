package testNG_Concepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcept {

	public WebDriver driver;
	private final String portalUrl = "https://www.t-mobile.com";

	@Test
	private void ParametersConceptTest() throws InterruptedException {
		launchPortal(portalUrl);
	}

	@Parameters({ "browser", "browserHeadlessFlag" })
	@BeforeClass
	private void launchBrowser(@Optional("Chrome") String browserName, @Optional("true") String browserHeadlessFlag) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			if (browserHeadlessFlag.equals(true)) {
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless=chrome");
				driver = new ChromeDriver(chromeOptions);
			} else {
				driver = new ChromeDriver();
			}
		}
		if (browserName.equalsIgnoreCase("Mozila")) {
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	private void launchPortal(String portalUrl) throws InterruptedException {
		driver.get(portalUrl);
		driver.manage().timeouts().getScriptTimeout();
		Thread.sleep(5000);
	}

	// to read/retrieve .xml file parameter values
	@BeforeClass
	public void beforeClass(ITestContext context) {
		String value = context.getCurrentXmlTest().getParameter("browser");
		System.err.println("browser = " + value);
		String value1 = context.getCurrentXmlTest().getParameter("browserHeadlessFlag");
		System.err.println("browserHeadlessFlag = " + value1);
		
		Map<String, String> allParam=context.getCurrentXmlTest().getAllParameters();
		
	}

}
