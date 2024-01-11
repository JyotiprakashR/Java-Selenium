package selenium_Concepts;

import org.testng.annotations.Test;
import base.BasePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import constants.Constants;
import utilities.CommonWebActions;
import utilities.FileReaderUtil;

public class AssertionConcept extends BasePage {

	@Test(enabled = false)
	public void test() throws Exception {
		CommonWebActions.getURL(driver, FileReaderUtil.getConfigProperty(Constants.URL));
		CommonWebActions.fillText(driver, FileReaderUtil.getObjProperty(Constants.USER_NAME_BTN),
				FileReaderUtil.getConfigProperty(Constants.USER_ID));
		CommonWebActions.fillText(driver, FileReaderUtil.getObjProperty(Constants.PASSWORD_BTN),
				FileReaderUtil.getConfigProperty(Constants.PASSWORD));
		CommonWebActions.clickElement(driver, FileReaderUtil.getObjProperty(Constants.SUBMIT_BTN));
		Assert.assertTrue(
				CommonWebActions.isDisplayed(driver, FileReaderUtil.getObjProperty(Constants.LOGIN_SUCCESS_MSG)));
	}

	public void navigateMethod() throws MalformedURLException {
		// navigate methods
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("String url");
		driver.navigate().to(new URL(null, null));

	}

	@Test
	public void switchToMethod() throws InterruptedException {
		CommonWebActions.getURL(driver, FileReaderUtil.getConfigProperty(Constants.URL));
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		//driver.switchTo().newWindow(WindowType.TAB);
//		Set<String> windowIds = driver.getWindowHandles();
//		Iterator<String> itr = windowIds.iterator();
//		String parentWindow=itr.next();
//		String childWindow=itr.next();
//		
//		driver.switchTo().window(childWindow);
//		driver.navigate().to("https://google.co.in/");
//		driver.close();
//		driver.switchTo().window(parentWindow);
//		driver.navigate().to("https://google.co.in/");
//		
//		System.out.println(driver.manage().getCookies().size());
//		driver.manage().getCookies().forEach(e->System.out.println(e));
		
		
//		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
//		System.out.println(driver.manage().timeouts().getPageLoadTimeout());
//		System.out.println(driver.manage().timeouts().getScriptTimeout());
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		driver.manage().window().setPosition(new Point(600, 500));
		driver.manage().window().setSize(new Dimension(600, 500));
		
		
		

	}

}
