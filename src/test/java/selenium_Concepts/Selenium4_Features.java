package selenium_Concepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.testng.annotations.Test;

import base.BasePage;
import utilities.CommonWebActions;

public class Selenium4_Features extends BasePage {

	@Test
	public void testt() throws IOException {
		CommonWebActions.getURL(driver, "https://google.co.in");
		WebElement element = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));

		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/webLementSS.png"));

	}

	public void teste1() throws IOException {
		WebElement element = driver.findElement(By.xpath(""));
		TakesScreenshot ta = (TakesScreenshot) element;
		File file = ta.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/webLementSS11.png"));
	}

	@Test
	public void tset() {
		CommonWebActions.getURL(driver, "https://google.co.in");
		WebElement element = driver.findElement(By.name("q"));
		String getAccessibleName = element.getAccessibleName(); // will print element name from browser
		System.out.println("getAccessibleName--"+getAccessibleName);

		String getAriaRole = element.getAriaRole();
		System.out.println("getAriaRole--"+getAriaRole);

		String colorName = element.getCssValue("color");
		System.out.println("font-size = " + element.getCssValue("font-size"));
		System.out.println("background = " + element.getCssValue("background"));
		System.out.println("line-height = " + element.getCssValue("line-height"));
		System.out.println("font-family = " + element.getCssValue("font-family"));
		
		
//		System.out.println(element.getDomAttribute(""));
//		
//		System.out.println(element.getDomProperty(""));
		
//		SearchContext driver1=element.getShadowRoot();
		
		System.out.println("getSize--"+element.getSize());
		
		Point point= element.getLocation();
		System.out.println("getX--"+point.getX());
		System.out.println("getY--"+point.getY());
		
		Rectangle rect= element.getRect();
		System.out.println("getHeight--"+rect.getHeight());
		System.out.println("getWidth--"+rect.getWidth());
		System.out.println("getX--"+rect.getX());
		System.out.println("getY--"+rect.getY());
		System.out.println("getDimension--"+rect.getDimension());
		System.out.println("getPoint--"+rect.getPoint());
		
		
		driver.findElement(RelativeLocator.with(By.tagName("textarea")).above(By.name("btnK"))).sendKeys("Automation");
		
		//driver.findElement(RelativeLocator.RelativeBy.tagName(""));

	}
	// Dyanmic WebTable
	@Test
	public void dynamicWebTable() {
		CommonWebActions.getURL(driver, "https://testuserautomation.github.io/WebTable/");
		
	}

}
