package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constants.Constants;
import utilities.FileReaderUtil;

public class BasePage {

	public static WebDriver driver = null;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // for the all the webelements// default value is 0 secs 
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));// for the page to load// default value is 300 secs
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(0));// for the all the javascriptExecutor...async method// default value is 30 secs
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
